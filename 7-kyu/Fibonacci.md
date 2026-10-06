https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af

## Java
```java
public class Fibonacci {

	public static long fib (int n){
    if (n == 0) return 0;
    else if (n == 1) return 1;
    else return fib(n-1) + fib(n-2);
  }
}
```

## Python
```py
def fibonacci(n: int) -> int:
    n1 = 0
    n2 = 1
    s = 0
    for i in range(1, n):
        s = n1 + n2
        n1 = n2
        n2 = s
    return 1 if n == 1 else s
```