# 处理用户输入

## 第一关
```shell
# 将输入参数存储在数组中 args=("$@") 
# 遍历数组并输出每个参数 
for ((i=0; i<${#args[@]}; i++)); do echo "$((i+1)) ${args[i]}" done
```

## 第二关
TODO

# 管道重定向
```
第一关：cb 第二关：c、bd
```

# 函数
```
welcome 、 A
```

```
step4/t1.sh：
#########   Begin  ##########

#1.请按照要求定义函数Hello ,函数Hello 执行的语句为  echo "文件包含test1.sh"
Hello() {
  echo "文件包含test1.sh"
}

#########   End    ##########

```

```
step4/main.sh：

#!/bin/bash

##########  Begin ##########

#1.引用step4/目录下t1.sh t2.sh,将他们包含进来。
. step4/t1.sh
. step4/t2.sh

##########  End   ##########

#调用t1.sh中的Hello 函数
Hello

#输出t2.sh中的变量$name
echo  "hello:$name"
```



# 流程控制

## 第一关
```
if [ $current_pod_num -gt 140 ] 
then 
    echo "pod数量为$current_pod_num,自动增加三台k8s集群节点"
elif [ $current_pod_num -ge 90 ] 
then 
    echo "pod数量为$current_pod_num,自动增加一台k8s集群节点"
else 
    echo "pod数量为$current_pod_num,不需要增加k8s集群节点"
fi
 
```

## 第二关 dc
## 第三关
```

#！/bin/bash

##习题一
###使用for循环和seq命令打印1到10之间的奇数 
###请参考实列4

##########  Begin  ##########
for i in `seq 1 2 10`
do
    echo "1~10之间的奇数分别是:-->$i"
done


##########  End   ##########

 
```

## 第四关 abac
## 第五关

## 第六关
TODO

# 内置命令
## 第二关

```
Var3=${var2: 4 :8}
echo -n $var $Var3
```
## 第三关

```
a=100
b=300
c=$a+$b
# echo $c

#********  End  *********#

declare -i ab
ab=$a+$b
echo $ab


#******** Begin   *********#

##2.补全代码[ $? -eq ]内的值，-eq的意思是‘等于’，注意 [ ] 两边要留一个空格
##通过$?判断上面的命令是否运行成功,如果运行成功则输出success ，否则输出 faild

if [ $? -eq 0 ]  ;then 
    echo "success"
else
    echo "faild"
fi


```
# 变量、字符串
## 第一关
```
touch /opt/test.sh
vim /opt/test.sh

#!/bin/bash
echo "Hello EduCoder"

chmod +x /opt/test.sh

```


## 第二关
```
touch /opt/test2.sh
vim /opt/test2.sh

#!/bin/bash
bash /opt/test.sh "$@"

vim /opt/test.sh

#!/bin/bash
echo "$#"
echo "$1"

chmod +x /opt/test2.sh
chmod +x /opt/test.sh

```

## 第三关
```
#!/bin/bash

  

string1="Hello www.educoder.net, hello linux! hello Shell ,Hello CNCF,hello Kubernetes,redis"

  

#********* Begin *********#

  

##1、str1 为 替换string1中第一次出现的 "Hello"为"hello"后的字符串

str1="${string1/Hello/hello}"

  

##2、str2 为 替换string1中所有的"Hello"为"hello"后的字符串

str2="${string1//Hello/hello}"

  

##3、str3 为 删除string1中的字符串"Kubernetes,"后的字符串

str3="${string1/Kubernetes,/}"

  

##4、变量length为字符串string1的长度,判断string1长度 完成如下代码：

##如果超过50则输出 "Length over 50" 如果小于等于50则输出"Length less than 50 "

  

length=${#string1}

  

if [ $length -gt 50 ]; then

echo "Length over 50"

else

echo "Length less than 50"

fi

  

#********* End *********#

  

echo $str1

echo $str2

echo $str3
```