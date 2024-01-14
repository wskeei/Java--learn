# 变量

- **定义变量：变量名=变量值，等号两侧不能有空格，变量名一般习惯用大写。
- **删除变量：unset 变量名 。
- **声明静态变量：readonly 变量名，静态变量不能unset。
- **使用变量：**$变量名



```bash
#!/bin/bash 
echo 'hello world!'
```


**位置参数变量**  
**基本语法**

- $n ：$0 代表命令本身、$1-$9 代表第1到9个参数，10以上参数用花括号，如 ${10}。
- $* ：命令行中所有参数，且把所有参数看成一个整体。
- $@ ：命令行中所有参数，且把每个参数区分对待。
- $# ：所有参数个数。

**实例：**  
编写 Shell 脚本 positionPara.sh ，输出命令行输入的各个参数信息。

```bash
#!/bin/bash     
# 输出各个参数 
echo $0 $1 $2 
echo $* 
echo $@ 
echo 参数个数=$#
```

  
运行：

```bash
chmod +x positionPara.sh 
./positionPara.sh 10 20
```

  
运行结果：

```bash
./positionPara.sh 10 20 
10 20 
10 20 
参数个数=2
```


```bash
TEMP=`expr 2 + 3` # 运行exper 2 + 3 结果返回给TEMP
```

**条件判断**

```bash
if [ 'test01' = 'test' ] 
then
     echo '等于' 
fi  
```

```bash
if [ $1 -ge 60 ]
then
    echo 及格
elif [ $1 -lt 60 ]
then
    echo "不及格" 
else # 不需要写then
	echo "测试"
fi
```

```bash
case $1 in
"1")
echo 周一
;;
"2")
echo 周二
;;
*)
echo 其它
;;
esac
```

### **for 循环**


```bash
for i in "$*" 
do     
    echo "the arg is $i" 
done 
```

### while
```bash
while [ 条件判断式 ]
do
    程序
done 
```


**Shift

shift 重命名位置参数，使第 i+n 个位置参数成为第 i 个位置参数，其中 n 是给定算术表达式的值。如果省略表达式，则默认值为 1。