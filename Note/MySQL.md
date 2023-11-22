# 表操作


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

## 聚合查询

## 多表查询

## 连接查询

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