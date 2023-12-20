# 入门

```shell
# 将输入参数存储在数组中 args=("$@") 
# 遍历数组并输出每个参数 
for ((i=0; i<${#args[@]}; i++)); do echo "$((i+1)) ${args[i]}" done
```


# 管道重定向
```
第一关：cb 第二关：c、bd
```

# 函数
```
welcome 、 A
```

# 流程控制

# 变量、字符串
```
touch /opt/test.sh
vim /opt/test.sh

#!/bin/bash
echo "Hello EduCoder"

chmod +x /opt/test.sh

```

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

