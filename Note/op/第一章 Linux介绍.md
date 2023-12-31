
- 管理员(`root`)登录系统后默认目录为 `/root`；
    
- 普通用户登录系统后默认目录为 `/home/username`

## Linux 常用命令介绍

### pwd
`pwd`：显示当前所在目录。
### cd 命令

`cd(Change Directory)`: 切换当前目录。

常用特殊目录表示：

- cd 进入用户主目录；
- cd ~ 进入用户主目录；
- cd - 返回进入此目录之前所在的目录；
- cd .. 返回上级目录(若当前目录为"/"，则执行完后还在"/"；".."为上级目录的意思)；
- cd ../.. 返回上两级目录；
- cd !$ 把上个命令的参数作为 `cd` 参数使用。

### ls 命令

`ls(list)`: 列出指定目录列表信息，如果没有参数默认列出当前目录下的所有文件和文件夹(隐藏文件和文件夹除外)。

常见`ls`命令选项:

- -l：以长格式显示目录下的内容列表。输出的信息从左到右依次包括文件名，文件类型、权限模式、硬连接数、所有者、组、文件大小和文件的最后修改时间等；
    
- -a：显示所有文件和文件夹 (包括隐藏文件/文件夹)。


## 文件操作
### 创建文件
`touch filename`
`touch file1 file2 ...`

### 删除文件

`rm [命令选项] filename`

常用命令选项：

1.  `-f：强制删除文件或目录；`
2.  `-r或-R：递归处理，将指定目录下的所有文件与子目录一并处理；`
3.  `-i：删除已有文件或目录之前先询问用户。`

## 文件夹操作

### 创建文件夹

`mkdir [命令选项] dirname`

常用命令选项： `-p或--parents` 若所要建立目录的上层目录目前尚未建立，则会一并建立上层目录；

### 删除文件夹
`Linux` 中删除文件夹的命令是 `rmdir` 或者 `rm -r`，命令格式如下：

`rmdir [命令选项] dirname`

常用命令选项：`-p或--parents：删除指定目录后，若该目录的上层目录已变成空目录，则将其一并删除；`

## 文件和文件夹拷贝

`Linux` 使用 `cp` 命令用来将一个或多个源文件或者目录复制到指定的目录中，命令格式如下：

`cp [命令选项] 源文件 目的文件`

常用命令选项：

1. `-f：强行复制文件或目录，不论目标文件或目录是否已存在；`
2. `-i：覆盖既有文件之前先询问用户；`
3. `-p：保留源文件或目录的属性；`
4. `-R/r：递归处理，将指定目录下的所有文件与子目录一并处理。`

## 文件和文件夹移动/重命名

Linux 使用 `mv` 命令用来对文件或目录重新命名，或者将文件从一个目录移到另一个目录中，命令格式如下：

`mv [命令选项] 源文件 目标文件`

常用命令选项：

1. `-f：强行复制文件或目录，不论目标文件或目录是否已存在；` 
2. `-i：覆盖既有文件之前先询问用户；`
3. `-p：保留源文件或目录的属性；`
4. `-R/r：递归处理，将指定目录下的所有文件与子目录一并处理'。`

## 文件/目录内容查看

### cat
`cat 参数 文件名`

常用参数如下：

- `-n 或 --number`：由`1`开始对所有输出的行数编号；
-  `-b 或 --number-nonblank`：和`-n`相似，只不过对于空白行不编号。

能同时查看多个文件，不能编辑
### head
`head 参数 文件名`

常用参数如下：

- `-n number`：显示文件的前`number`行内容；

- `head`命令是从文件的开头显示内容，默认情况下只显示前`10`行的内容；
### tail
`tail 参数 文件名`

常用参数如下：

- `-n number`：显示文件的最后`number`行内容；

具体说明：

- `tail`命令是从文件的结尾显示内容，默认情况下只显示最后`10`行的内容；
### 查看

`ls 参数 目录`

常用参数如下：

- -a：显示所有档案及目录（`ls`内定将档案名或目录名称为“.”的视为影藏，不会列出）；
- -A：显示除影藏文件“.”和“..”以外的所有文件列表；
- -l：列出内容的详细信息；
- -r：以文件名反序排列并输出目录内容列表；
- -s：显示文件和目录的大小，以区块为单位；
- -i：显示文件索引节点号（`inode`）。一个索引节点代表一个文件；
- -R：递归处理，将指定目录下的所有文件及子目录一并处理。
## 查询命令帮助语句

## man 命令

使用`man`命令来查询命令的帮助文件
## info 命令
使用 `info` 命令来查询命令的帮助文件。

## whatis 命令

`whatis`用来显示命令的简短描述。