# 第一关

## 判断输入的是否为闰年。

```
#include <stdio.h>

  

int main() {

int year;

  

// 提示用户输入年份

  

scanf("%d", &year);

  

// 判断是否为闰年

if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {

printf("%d年是闰年。\n", year);

} else {

printf("%d年不是闰年。\n", year);

}

  

return 0;

}
```

## 任意输入一个三位数，如果有且仅有两个数位相同，则输出`1`，否则输出`0`。

```
#include <stdio.h>

  

int main() {

int num;

  

// 提示用户输入一个三位数

scanf("%d", &num);

  

// 检查是否为三位数

if (num >= 100 && num <= 999) {

// 提取各个数位

int digit1 = num / 100;

int digit2 = (num / 10) % 10;

int digit3 = num % 10;

  

// 判断是否有且仅有两个数位相同

if ((digit1 == digit2 && digit1 != digit3) ||

(digit1 == digit3 && digit1 != digit2) ||

(digit2 == digit3 && digit1 != digit2)) {

printf("1\n");

} else {

printf("0\n");

}

} else {

printf("输入不是三位数。\n");

}

  

return 0;

}
```

# 第二关
## 给出一百分制成绩，要求输出成绩等级`A、B、C、D`。`85`分及以上为`A`，`84~70`分为`B`，`69~60`分为`C`，`60`分以下为`D`。

```
#include <stdio.h>

  

int main() {

int score;

  

// 提示用户输入成绩

scanf("%d", &score);

  

// 判断成绩等级

if (score >= 85) {

printf("成绩是%d,相应的等级是A\n", score);

} else if (score >= 70) {

printf("成绩是%d,相应的等级是B\n", score);

} else if (score >= 60) {

printf("成绩是%d,相应的等级是C\n", score);

} else {

printf("成绩是%d,相应的等级是D\n", score);

}

  

return 0;

}
```


##  switch语句求分段函数

```
输入x，求分段函数:

`x∈[0,10)`时，`y=cos(x+3.0)`； `x∈[10,20)`时，`y=cos^2(x+7.5)`; `x∈[20,30)`时，`y=cos^4(x+4.0)`。

如果x不在定义域内，输出“`No define`”，否则输出`y`，并保留`5`位小数。
```


```
#include <stdio.h>

#include <math.h>

  

int main() {

double x;

  

// 提示用户输入x

scanf("%lf", &x);

  

// 判断x所在的区间并计算y

double y;

if (x >= 0 && x < 10) {

y = cos(x + 3.0);

} else if (x >= 10 && x < 20) {

y = pow(cos(x + 7.5), 2);

} else if (x >= 20 && x < 30) {

y = pow(cos(x + 4.0), 4);

} else {

printf("No define\n");

return 0;

}

  

// 输出y，保留5位小数

printf("%.5lf\n", y);

  

return 0;

}
```

# 第三关
## 求出分数序列前 n 项之和

```
有一分数序列：`2/1，3/2，5/3，8/5，13/8，21/13...`求出这个数列的前`n`项之和，`n<=30`。 要求：求出分数序列前`n`项之和，`n`由`scanf`函数输入。
```

```
#include <stdio.h>

  

int main() {

int n;

  

scanf("%d", &n);

  

if (n <= 0 || n > 30) {

printf("输入的n不在有效范围内。\n");

return 1;

}

  

// 初始化分数序列的前两项

double numerator1 = 2, denominator1 = 1;

double numerator2 = 3, denominator2 = 2;

  

// 初始化和

double sum = numerator1 / denominator1 + numerator2 / denominator2;

  

// 计算分数序列的前n项之和

for (int i = 3; i <= n; i++) {

double numerator = numerator1 + numerator2;

double denominator = denominator1 + denominator2;

  

sum += numerator / denominator;

  

// 更新分数序列的前两项

numerator1 = numerator2;

denominator1 = denominator2;

numerator2 = numerator;

denominator2 = denominator;

}

  

// 输出结果

printf("n=%d,sum=%.6lf", n, sum);

  

return 0;

}
```

## 求 x 与 y 的最大公因数

```
输入两个正整数`x`,`y`(`1<=x`,`y<=231-1`)，求`x`与`y`的最大公因数。第一行输入一个整数`n`，表示测试用例的个数，以后每行输入两个正整数。每行输出一个测试样例的结果
```

```
#include <stdio.h>

  

// 辗转相除法求最大公因数

int gcd(int a, int b) {

int temp;

while (b != 0) {

temp = b;

b = a % b;

a = temp;

}

return a;

}

  

int main() {

int n;

  

scanf("%d", &n);

  

for (int i = 0; i < n; i++) {

int x, y;

scanf("%d %d", &x, &y);

  

int result = gcd(x, y);

  

printf("GCD(%d,%d)=%d\n", x, y, result);

}

  

return 0;

}
```

# 第四关

## 求 `s=a+aa+aaa+aaaa+aa...a` 的值

```
例如`a=2`时，表示计算由`2`组成的数的和：`2+22+222+2222+22222` ( 此时 共有5个数相加，数字个数也由键盘输入)。

输入：`3，5`表示`3`个由`5`组成的数相加，即计算`5+55+555`的值，输出：`615` 输入：`4，5`表示计算`5+55+555+5555`的值，输出：`6170`。
```

```
#include <stdio.h>

  

// 计算 s = a + aa + aaa + aaaa + ... 的值

int calculateSum(int a, int count) {

int result = 0;

int currentNumber = 0;

  

for (int i = 1; i <= count; i++) {

currentNumber = currentNumber * 10 + a;

result += currentNumber;

}

  

return result;

}

  

int main() {

int a, count;

  

// 提示用户输入参数

scanf("%d,%d", &count, &a);

  

// 计算并输出结果

int result = calculateSum(a, count);

printf("%d\n", result);

  

return 0;

}
```


##  求1+2!+3!+...+n!的和

```
#include <stdio.h>

  

// 计算阶乘

int factorial(int num) {

if (num == 0 || num == 1) {

return 1;

} else {

return num * factorial(num - 1);

}

}

  

int main() {

int n;

  

// 提示用户输入 n

scanf("%d", &n);

  

if (n >= 12) {

return 1;

}

  

// 计算并输出结果

int sum = 0;

for (int i = 1; i <= n; i++) {

sum += factorial(i);

}

  

printf("%d\n", sum);

  

return 0;

}
```

# 第五关

## 数字计数



```
计算在区间 `1` 到 `n` 的所有整数中，数字 `x（0 ≤ x ≤ 9）`共出现了多少次？

例如，在 `1`到 `11` 中，即在 `1、2、3、4、5、6、7、8、9、10、11` 中，数字 `1` 出现了 `4` 次。

输入格式：输入两个整数，第一个数为`n`的值，第二个为`x`的值。
```

```
#include <stdio.h>

  

// 计算数字 x 在整数 num 中出现的次数

int countOccurrences(int num, int x) {

int count = 0;

while (num > 0) {

if (num % 10 == x) {

count++;

}

num /= 10;

}

return count;

}

  

// 计算在区间 1 到 n 的所有整数中，数字 x 出现的总次数

int countTotalOccurrences(int n, int x) {

int totalCount = 0;

for (int i = 1; i <= n; i++) {

totalCount += countOccurrences(i, x);

}

return totalCount;

}

  

int main() {

int n, x;

  

// 提示用户输入 n 和 x

scanf("%d %d", &n, &x);

  

// 计算并输出结果

int result = countTotalOccurrences(n, x);

printf("%d\n", result);

  

return 0;

}
```


## 统计各位数字之和能被15整除的整数的个数

```
本关任务：输入一个正整数`N`，统计`[1，N]`范围内每个整数的**数位之和**能被`15`整除的整数个数。

例如：`N=100`，则满足条件的整数有：`69,78,87,96`，共计`4`个。
```

```
#include <stdio.h>

  

// 计算一个整数的数位之和

int digitSum(int num) {

int sum = 0;

while (num > 0) {

sum += num % 10;

num /= 10;

}

return sum;

}

  

int main() {

int N;

  

// 提示用户输入 N

scanf("%d", &N);

  

// 统计并输出结果

int count = 0;

for (int i = 1; i <= N; i++) {

if (digitSum(i) % 15 == 0) {

count++;

}

}

  

printf("%d\n", count);

  

return 0;

}
```

# 第六关
## 数组的逆序输出


```
#include <stdio.h>

  

int main() {

int a[5];

  

// 提示用户输入数组元素

for (int i = 0; i < 5; i++) {

scanf("%d", &a[i]);

}

  

// 逆序输出数组

for (int i = 4; i >= 0; i--) {

printf("%5d", a[i]);

if (i > 0) {

printf(",");

}

}

  

return 0;

}
```

## 数列排序

```
输入两行数，第一行为`n`，表示需要排序的数的个数。第二行表示需要排列的数。使他们从大到小排列并输出。
```

```
#include <stdio.h>

  

// 降序排序

void descendingSort(int arr[], int n) {

for (int i = 0; i < n - 1; i++) {

for (int j = 0; j < n - i - 1; j++) {

if (arr[j] < arr[j + 1]) {

// 交换元素

int temp = arr[j];

arr[j] = arr[j + 1];

arr[j + 1] = temp;

}

}

}

}

  

int main() {

int n;

  

// 提示用户输入n

scanf("%d", &n);

  

if (n <= 0) {

return 1;

}

  

int arr[n];

  

// 提示用户输入需要排序的数

for (int i = 0; i < n; i++) {

scanf("%d", &arr[i]);

}

  

// 降序排序

descendingSort(arr, n);

  

// 输出排序结果

for (int i = 0; i < n; i++) {

printf("%d", arr[i]);

if (i < n - 1) {

printf(" ");

}

}

  

return 0;

}
```

# 第七关

## 删除字符串中的指定字符

```
编写程序，任意输入一个字符串（字符数小于`100`），输入一个字符，然后去掉字符串中的该字符，并输出去掉字符后的字符串。

例1，输入字符串`"asdfga"`和字符`'a'`，则输出`"sdfg"`。 例2，输入一个英文句子和空格字符，则输出**删除了所有空格**的字符串。
```

```
#include <stdio.h>

  

int main() {

char s[100];

char c;

  

// 输入字符串

scanf("%[^\n]s", s);

  

// 输入字符

scanf(" %c", &c);

  

// 去掉字符串中的该字符或空格

for (int i = 0; s[i] != '\0'; ++i) {

if (s[i] != c && s[i] != ' ') {

printf("%c", s[i]);

}

}

  

printf("\n");

  

return 0;

}
```

## 字符串大小写转换

```
给定一个任意的字符串，比如“`AbcDEF`”，要求将其中的小写字母全部转换成大写字母，小写字母以外的字符不发生变化。
```

```
#include <stdio.h>

  

int main() {

char str[100];

  

// 输入字符串

printf("Please input string:\n");

scanf("%s", str);

  

// 转换小写字母为大写字母

for (int i = 0; str[i] != '\0'; ++i) {

if (str[i] >= 'a' && str[i] <= 'z') {

str[i] = str[i] - ('a' - 'A');

}

}

  

// 输出结果

printf("lowercase change to uppercase:\n");

printf("%s", str);

  

return 0;

}
```
# 第八关
## 杨辉三角

```
输入`n`，求出`n`阶杨辉三角。
```

```
#include <stdio.h>

  

// 计算组合数C(n, k)

int binomialCoefficient(int n, int k) {

if (k == 0 || k == n) {

return 1;

} else {

return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);

}

}

  

// 打印n阶杨辉三角

void printPascalTriangle(int n) {

for (int i = 0; i < n; i++) {

for (int j = 0; j <= i; j++) {

printf("%d", binomialCoefficient(i, j));

  

if (j < i) {

printf(" ");

}

}

printf("\n");

}

}

  

int main() {

int n;

  

// 提示用户输入n

scanf("%d", &n);

  

// 打印n阶杨辉三角

printPascalTriangle(n);

  

return 0;

}
```

## 回文串

```
“回文串”是一个正读和反读都一样的字符串，比如“`level`”或者“`noon`”等等就是回文串。请写一个程序判断读入的字符串是否是“回文”, 是则输出 `yes`，不是则输出`no`。
```

```
#include <stdio.h>

#include <string.h>

  

// 判断是否为回文串

int isPalindrome(char str[]) {

int len = strlen(str);

for (int i = 0; i < len / 2; i++) {

if (str[i] != str[len - i - 1]) {

return 0; // 不是回文串

}

}

return 1; // 是回文串

}

  

int main() {

char inputString[100];

  

// 提示用户输入字符串

scanf("%s", inputString);

  

// 判断是否为回文串并输出结果

if (isPalindrome(inputString)) {

printf("yes\n");

} else {

printf("no\n");

}

  

return 0;

}
```

# 第九关
## 最小公倍数

```
求`n`个数的最小公倍数。

每个测试实例的开始是一个正整数`n`，然后是`n`个正整数。

为每组测试数据输出它们的最小公倍数，每个测试实例的输出占一行。你可以假设最后的输出是一个`32`位的整数。
```

```
#include <stdio.h>

  

// 计算两个数的最大公约数（欧几里得算法）

int gcd(int a, int b) {

while (b != 0) {

int temp = b;

b = a % b;

a = temp;

}

return a;

}

  

// 计算两个数的最小公倍数

int lcm(int a, int b) {

return (a * b) / gcd(a, b);

}

  

// 计算 n 个数的最小公倍数

int calculateLCM(int arr[], int n) {

int result = arr[0];

for (int i = 1; i < n; i++) {

result = lcm(result, arr[i]);

}

return result;

}

  

int main() {

int n;

  

// 提示用户输入 n

scanf("%d", &n);

  

if (n <= 0) {

return 1;

}

  

int arr[n];

  

// 提示用户输入 n 个数

for (int i = 0; i < n; i++) {

scanf("%d", &arr[i]);

}

  

// 计算并输出结果

int result = calculateLCM(arr, n);

printf("%d\n", result);

  

return 0;

}
```
## 进制转换

```
输入一个十进制数`N`，将它转换成`R`进制数输出。

每个测试实例包含两个整数`N`(`32`位整数)和`R`（`2<=R<=16`, `R!=10`）。

为每个测试实例输出转换后的数，每个输出占一行。如果`R`大于`10`，则对应的数字规则参考`16`进制（比如，`10`用`A`表示，等等）。
```


```
#include <stdio.h>

  

// 将十进制数N转换成R进制数

void convertToBase(int N, int R) {

char result[100];

int index = 0;

  

// 处理负数情况

if (N < 0) {

printf("-");

N = -N;

}

  

// 将N转换为R进制

while (N > 0) {

int remainder = N % R;

result[index++] = (remainder < 10) ? (remainder + '0') : (remainder - 10 + 'A');

N /= R;

}

  

// 输出转换后的数

for (int i = index - 1; i >= 0; i--) {

printf("%c", result[i]);

}

printf("\n");

}

  

int main() {

int N, R;

  

// 提示用户输入十进制数和目标进制

scanf("%d %d", &N, &R);

  

if (R < 2 || R > 16 || R == 10) {

return 1;

}

  

// 转换并输出结果

convertToBase(N, R);

  

return 0;

}
```


# 第10关

## 素数筛法求素数

```
用素数筛法求出`2~N`以内的所有素数并输出。每`5`个数字输出一行，每个数字之间用空格分隔开。
```

```
#include <stdio.h>

#include <stdbool.h>

  

void sieveOfEratosthenes(int N) {

bool isPrime[N + 1];

  

for (int i = 0; i <= N; i++) {

isPrime[i] = true;

}

  

for (int p = 2; p * p <= N; p++) {

if (isPrime[p]) {

for (int i = p * p; i <= N; i += p) {

isPrime[i] = false;

}

}

}

  

int count = 0;

  

for (int i = 2; i <= N; i++) {

if (isPrime[i]) {

printf("%d", i);

count++;

if (count % 5 == 0) {

printf("\n");

} else {

printf(" ");

}

}

}

}

  

int main() {

int N;

  

// 提示用户输入N的值

printf("请输入N的值：\n");

scanf("%d", &N);

  

if (N < 2) {

return 1;

}

  

// 输出2到N以内的所有素数

sieveOfEratosthenes(N);

  

return 0;

}
```

## 选择排序

```
  
针对一组数据`a[7]`，进行升序排序。假设所排序序列的记录个数为`n`，则`i`取`1,2,3，……，n-1，`从所有`n-i+1`个记录`（Ri,Ri+1,…,Rn）`中找出最小值的记录，与第`i`个记录交换。执行`n-1`次循环后就完成了记录序列的升序排序。。

```
``
```
#include <stdio.h>

  

// 选择排序函数

void selectionSort(int arr[], int n) {

for (int i = 0; i < n - 1; i++) {

int minIndex = i;

  

// 找出未排序部分的最小值的索引

for (int j = i + 1; j < n; j++) {

if (arr[j] < arr[minIndex]) {

minIndex = j;

}

}

  

// 交换最小值与当前位置的元素

int temp = arr[i];

arr[i] = arr[minIndex];

arr[minIndex] = temp;

}

}

  

int main() {

int arr[7];

  

// 提示用户输入数组元素

for (int i = 0; i < 7; i++) {

scanf("%d", &arr[i]);

}

  

// 执行选择排序

selectionSort(arr, 7);

  

// 输出排序结果

for (int i = 0; i < 7; i++) {

printf("%d", arr[i]);

if (i < 6) {

printf(" ");

}

}

printf("\n");

  

return 0;

}
```

# 第十一关

## 最大公约数和最小公倍数

```
#### 编程要求

求**两个正整数**的**最大公约数**与**最小公倍数**。

#### 测试说明

我会对你编写的代码进行测试：

样例输入： `12 16` 样例输出： `请输入两个正整数：` `12和16的最大公约数是：4` `12和16的最小公倍数是：48`
```

```
#include <stdio.h>

  

// 计算两个数的最大公约数（欧几里得算法）

int gcd(int a, int b) {

while (b != 0) {

int temp = b;

b = a % b;

a = temp;

}

return a;

}

  

// 计算两个数的最小公倍数

int lcm(int a, int b) {

return (a * b) / gcd(a, b);

}

  

int main() {

int num1, num2;

  

// 提示用户输入两个正整数

printf("请输入两个正整数：\n");

scanf("%d %d", &num1, &num2);

  

if (num1 <= 0 || num2 <= 0) {

printf("输入的数字必须为正整数。\n");

return 1;

}

  

// 计算并输出最大公约数与最小公倍数

printf("%d和%d的最大公约数是：%d\n", num1, num2, gcd(num1, num2));

printf("%d和%d的最小公倍数是：%d", num1, num2, lcm(num1, num2));

  

return 0;

}
```

## 折半查找法

```
  
首先输入`N`，确定要输入的个数，然后按**由小到大**的顺序将`N`个值存放在一个数组中。**输入一个数:number**，要求用折半查找法找出该数是数组中**第几个元素的值**。如果该数**不在数组中**，则打印出“**number is not found **”（`number` 是这个数的标识符）。
```

```
#include <stdio.h>

  

// 折半查找

int binarySearch(int arr[], int size, int target) {

int left = 0;

int right = size - 1;

  

while (left <= right) {

int mid = left + (right - left) / 2;

  

if (arr[mid] == target) {

return mid + 1; // 返回位置（从1开始计数）

} else if (arr[mid] < target) {

left = mid + 1;

} else {

right = mid - 1;

}

}

  

return -1; // 表示未找到

}

  

int main() {

int N;

  

// 提示用户输入N

printf("Enter date:\n");

scanf("%d", &N);

  

if (N <= 0) {

printf("Invalid input.\n");

return 1;

}

  

int arr[N];

  

// 提示用户输入N个数

for (int i = 0; i < N; i++) {

scanf("%d", &arr[i]);

}

  

// 输出数组

for (int i = 0; i < N; i++) {

printf("%d", arr[i]);

if (i < N - 1) {

printf(",");

}

}

printf("\n");

  

char choice;

  

do {

int target;

printf("Input the number to look for:\n");

scanf("%d", &target);

  

int position = binarySearch(arr, N, target);

  

if (position != -1) {

printf("Find %d,its position is %d\n", target, position);

} else {

printf("%d is not found.\n", target);

}

  

printf("Continue or not(Y/N)?\n");

scanf(" %c", &choice);

  

} while (choice == 'Y' || choice == 'y');

  

return 0;

}
```

## 第十二关
## 在数字中插入分隔符

```
在数字中插入千分位分隔符并输出。
```

```
#include <stdio.h>

  

// 在数字中插入千分位分隔符

void insertThousandSeparator(int num) {

// 将数字转换为字符串

char numStr[20];

sprintf(numStr, "%d", num);

  

// 计算需要插入的逗号数量

int len = 0;

while (numStr[len] != '\0') {

len++;

}

int commaCount = (len - 1) / 3;

  

// 输出带千分位分隔符的数字

for (int i = 0; i < len; i++) {

printf("%c", numStr[i]);

if (i < len - 1 && (len - 1 - i) % 3 == 0) {

printf(",");

}

}

printf("\n");

}

  

int main() {

int num;

  

// 提示用户输入数字

scanf("%d", &num);

  

// 输出带千分位分隔符的数字

insertThousandSeparator(num);

  

return 0;

}
```

## 合法标识符判断
```
输入一个字符串，判断其是否是C的合法标识符。
```

```
#include <stdio.h>

#include <string.h>

  

int main() {

int n;

char s[55];

char tmp;

scanf("%d", &n);

getchar(); // 消耗掉输入缓冲区中的换行符

  

while (n--) {

int f = 1, i = 0;

  

fgets(s, sizeof(s), stdin);

if (strlen(s) != sizeof(s) - 1)

s[strlen(s) - 1] = '\0';

  

// 请在此添加你的代码

/********** Begin **********/

if (!((s[0] >= 'a' && s[0] <= 'z') || (s[0] >= 'A' && s[0] <= 'Z') || s[0] == '_')) {

f = 0;

} else {

for (i = 1; i < strlen(s); i++) {

if (!((s[i] >= 'a' && s[i] <= 'z') || (s[i] >= 'A' && s[i] <= 'Z') || (s[i] >= '0' && s[i] <= '9') || s[i] == '_')) {

f = 0;

break;

}

}

}

  

if (f) {

printf("yes\n");

} else {

printf("no\n");

}

/********** End **********/

}

  

return 0;

}
```