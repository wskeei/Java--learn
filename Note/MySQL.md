# 表操作

## 创建表：
`CREATE TABLE`

```
create table 表名(列名 数据类型[列级约束条件], 
			列名 数据类型[列级约束条件], 
			... 
			[,表级约束条件])
```
### 数据类型
字符串存储：

- char(n)可以存储任意字符串，但是是固定长度为n，如果插入的长度小于定义长度时，则用空格填充。
- varchar(n)也可以存储任意数量字符串，长度不固定，但不能超过n，不会用空格填充。

存储数字：

- smallint用于存储小的整数，范围在 (-32768，32767)
- int用于存储一般的整数，范围在 (-2147483648，2147483647)
- bigint用于存储大型整数，范围在 (-9,223,372,036,854,775,808，9,223,372,036,854,775,807)
- float用于存储单精度小数
- double用于存储双精度的小数

存储时间：

- date存储日期
- time存储时间
- year存储年份
- datetime用于混合存储日期+时间
### 列级约束条件

列级约束有六种：主键Primary key、外键foreign key 、唯一 unique、检查 check （MySQL不支持）、默认default 、非空/空值 not null/ null 

自增：AUTO_INCREMENT,

### 表级约束条件

表级约束有四种：主键、外键、唯一、检查

## 删除表使用
`DROP TABLE`

```
DROP TABLE students
```

## 修改表：

给`students`表新增一列`birth`

```
ALTER TABLE students ADD COLUMN birth VARCHAR(10) NOT NULL;
```

修改`birth`列，把列名改为`birthday`，类型改为`VARCHAR(20)`：

```
ALTER TABLE students CHANGE COLUMN birth birthday VARCHAR(20) NOT NULL;
```

删除列

```
ALTER TABLE students DROP COLUMN birthday;
```

### 外键
```SQL
ALTER TABLE students # 修学生表
ADD CONSTRAINT fk_class_id # 外键约束命名
FOREIGN KEY (class_id) # 指定class_id为外键
REFERENCES classes (id); # 外键关联到classes的id列

```
### 引索
```
ALTER TABLE students
ADD INDEX idx_score (score); # 对score列创建引索，引索名称为idx_score
```

#### 唯一引索
```
ALTER TABLE students
ADD UNIQUE INDEX uni_name (name); # 对name创建唯一引索
```

```
ALTER TABLE students
ADD CONSTRAINT uni_name UNIQUE (name); 
#对name添加唯一约束而不创建唯一引索
```

## 查询
## 基本查询
```
SELECT * FROM <表名> # *:表示所有列
```

`SELECT * FROM students; #查询students表的所有数据

### 条件查询
使用`WHERE`实现
```
SELECT * FROM <表名> WHERE <条件表达式> AND <条件表达式>……
```

`SELECT * FROM students WHERE score >= 80

条件运算：`AND OR NOT`

### 投影查询
即只查询某些列的数据
```
SELECT 列1, 列2, 列3 FROM ...
```

#### 重命名 
使用`SELECT 列1, 列2, 列3 FROM ...`时，还可以给每一列起个别名，这样，结果集的列名就可以与原表的列名不同。它的语法是

`SELECT 列1 别名1, 列2 别名2, 列3 别名3 FROM ...`

如：`SELECT id, score points, name FROM students;`

### 排序
使用`ORDER BY`实现

```
SELECT id, name, gender, score FROM students ORDER BY score;
# 按照score 正序排列 默认正序
```

```
SELECT id, name, gender, score FROM students ORDER BY score DESC;
# 倒序
```

```
SELECT id, name, gender, score FROM students ORDER BY score DESC, gender;
# score相同的情况下按gender列排序
```

```
SELECT id, name, gender, score
FROM students
WHERE class_id = 1
ORDER BY score DESC;

```

## 分页查询

从结果集中“截取”出第M~N条记录：
`LIMIT <N-M> OFFSET <M>`

结果集分页，每页3条记录。获取第1页的记录：
```
SELECT id, name, gender, score
FROM students
ORDER BY score DESC
LIMIT 3 OFFSET 0;
```
`LIMIT 3 OFFSET 0`表示，对结果集从0号记录开始，最多取3条


查询第2页
```
SELECT id, name, gender, score
FROM students
ORDER BY score DESC
LIMIT 3 OFFSET 3;

```

* `pageSize`  每页需要显示的结果数量
* `pageIndex` 当前页的索引
- `LIMIT`总是设定为`pageSize`；
- `OFFSET`计算公式为`pageSize * (pageIndex - 1)`。

## 聚合查询
查询`students`表一共有多少条记录
```
SELECT COUNT(*) FROM students;
# 聚合的计算结果虽然是一个数字，但查询的结果仍然是一个二维表，只是这个二维表只有一行一列，并且列名是`COUNT(*)`
```

使用聚合查询并设置结果集的列名为num:
```
SELECT COUNT(*) num FROM students;

```

可以使用WHERE：
```
SELECT COUNT(*) boys FROM students WHERE gender = 'M';
```


* SUM: 计算某一列的合计值，该列必须为数值类型
*  AVG: 计算某一列的平均值，该列必须为数值类型
* MAX: 计算某一列的最大值
* MIN: 计算某一列的最小值

统计男生的平均成绩:
```
SELECT AVG(score) average FROM students WHERE gender = 'M';

```

### 分组聚合
```
SELECT COUNT(*) num FROM students GROUP BY class_id;

```
执行该`SELECT`语句时，会把`class_id`相同的列先分组，再分别计算，因此，得到了多个结果。

把`class_id`列也放入结果集中：
```
SELECT class_id, COUNT(*) num FROM students GROUP BY class_id;
```

## 多表查询
从多张表同时查询数据


```
SELECT * FROM students, classes;
```
得到两个表的笛卡尔乘积

给两个表各自的`id`和`name`列起别名：
```
SELECT
    students.id sid,
    students.name sname,
    students.gender,
    students.score,
    classes.id cid,
    classes.name cname
FROM students, classes;

```

给表设置别名：
```
SELECT
    s.id sid,
    s.name,
    s.gender,
    s.score,
    c.id cid,
    c.name cname
FROM students s, classes c;
```

同时可以添加`WHERE`条件

## 连接查询
在确定一个主表作为结果集的基础上，把其他表的行有选择性地“连接”在主表结果集上。

### 内连接：
选出所有学生，同时返回班级名称。班级名称在 classes 表中
```
SELECT s.id, s.name, s.class_id, c.name class_name, s.gender, s.score
FROM students s
INNER JOIN classes c # 需要连接的表
ON s.class_id = c.id; # 确定连接条件

```
  
INNER JOIN只返回同时存在于两张表的行数据
### 外连接
```
SELECT s.id, s.name, s.class_id, c.name class_name, s.gender, s.score
FROM students s
RIGHT OUTER JOIN classes c # 右表查询
ON s.class_id = c.id;

```
`RIGHT OUTER JOIN` 返回右表都存在的行  classse为右表

同时存在：
`LEFT OUTER JOIN`：选出左表存在的记录
`FULL OUTER JOIN`：选出左右表都存在的记录


# 修改数据

## 插入
使用`INSERT`实现

基本语法
```
INSERT INTO <表名> (字段1, 字段2, ...) VALUES (值1, 值2, ...);
```

如：
```
INSERT INTO students (class_id, name, gender, score) VALUES (2, '大牛', 'M', 80);

```

```
INSERT INTO students (class_id, name, gender, score) VALUES
  (1, '大宝', 'M', 87),
  (2, '二宝', 'M', 81);
  # 一次插入多个 逗号隔开
```

## 更新
基本语法是：

```
UPDATE <表名> SET 字段1=值1, 字段2=值2, ... WHERE ...;
```

更新`students`表`id=1`的记录的`name`和`score`这两个字段:
```
UPDATE students SET name='大牛', score=66 WHERE id=1;

```

更新多个：
```
UPDATE students SET name='小牛', score=77 WHERE id>=5 AND id<=7;

```

所有表都被更新：
```
UPDATE students SET score=60;
```

## 删除
使用`DELETE`

基本语法是：

```
DELETE FROM <表名> WHERE ...;
```

删除`students`表中`id=1`的记录
```
DELETE FROM students WHERE id=1;
```

删除id=5,6,7的记录
```
DELETE FROM students WHERE id>=5 AND id<=7;

```

删除整个表的数据
```
DELETE FROM students;
```


# 库
创建一个新数据库：
```
CREATE DATABASE test;
```


删除一个数据库
```
DROP DATABASE test
```

切换数据库
```
USE test
```

列出当前数据库的所有表

```
SHOW TABLES;
```

查看一个表的结构

```
DESC students
```

查看创建表的SQL语句

```
SHOW CREATE TABLE students
```