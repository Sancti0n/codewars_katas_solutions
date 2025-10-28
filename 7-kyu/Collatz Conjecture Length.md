https://www.codewars.com/kata/54fb963d3fe32351f2000102

## Python
```python
def collatz(n):
    s = 1
    while n != 1:
        if n%2: n = n*3 + 1
        else: n = n//2
        s += 1
    return s
```

## JavaScript
```js
function collatz(n) {
  let s = 1;
  while (n != 1) {
    if (n%2) n = n*3 + 1;
    else n = Math.trunc(n/2);
    s += 1;
  }
  return s
}
```

## Java
```java
public class Collatz {
  public static long conjecture(long x) {
    long s = 1;
    while (x != 1) {
      if (x%2 == 1) {
        x = x*3 + 1;
      }
      else {
        x = x/2;
      }
      s++;
    }
    return s;
  }
}
```