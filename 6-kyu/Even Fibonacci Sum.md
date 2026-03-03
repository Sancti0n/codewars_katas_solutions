https://www.codewars.com/kata/55688b4e725f41d1e9000065

## JavaScript
```js
function fibonacci(max) {
  let s = 0, a = 0, b = 1, temp = 0;
  while (b<max) {
    if (b%2<1) s += b;
    temp = a;
    a = b;
    b += temp
  }
  return s
}
```

## Python
```py
def even_fib(n):
    s, a, b = 0, 0, 1
    while b<n:
        if b%2<1:
            s += b
        a, b = [b, a+b]
    return s
```

## Java
```java
class Kata {
  public static long fibonacci(long max) {
    long s = 0;
    long a = 0;
    long b = 1;
    long temp = 0;
    while (b<max) {
      if (b%2<1) {
        s += b;
      }
      temp = a;
      a = b;
      b += temp;
    }
    return s;
  }
}
```