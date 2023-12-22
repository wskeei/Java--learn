# python

## 第一关

```
result = sum(numbers)
```

## 第二关

```
def gcd(x, y):
    while y:
        x, y = y, x % y
    return x
```

## 第三关

```
# 定义一个private函数 _gcd() 求两个正整数的最大公约数
def _gcd(x, y):
    while y:
        x, y = y, x % y
    return x

# 定义public函数 lcm() 调用 _gcd() 函数求两个正整数的最小公倍数
def lcm(x, y):
    return x * y // _gcd(x, y)

```


# 基本实验工具 GDB 的使用

```
cd /data/workspace/myshixun/
########## Begin ##########


gcc -g main.c -o main 

gdb ./main <<EOF
break 4
break 6
run
print a 
continue
print a
continue
quit


########## End ##########
EOF

```

# 实验工具 GCC 与 objdump 的使用

```
unsigned char bytes[10] = {

  //########## Begin ##########

 0x55, 0x48, 0x89, 0xe5, 0x48, 0x83, 0xec, 0x10, 0x48, 0xc7

   //########## End ##########

};
```

