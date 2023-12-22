## 润年
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

## 选择结构if语句测试

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

## 选择结构switch语句测试

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

## 循环结构
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

## 第六关
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

## 第七关

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
## 第八关

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

## 10
## 第10关

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

## 11
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