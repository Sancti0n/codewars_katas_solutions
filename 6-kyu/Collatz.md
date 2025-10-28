https://www.codewars.com/kata/5286b2e162056fd0cb000c20

## Python
```python
def collatz(n):
    w = str(n)
    while n != 1:
        if n%2 == 0: n = n//2
        else: n = 3*n + 1
        w += "->"+str(n)
    return w
```

## JavaScript
```js
function collatz(n) {
  let w = n.toString();
  while (n != 1) {
    if (n%2 == 0) n = n/2;
    else n = 3*n + 1;
    w += "->" + n.toString();
  }
  return w
}
```

## Java
```java
public class Collatz {
  public static String collatz(int n) {
    String w = Integer.toString(n);
    while (n != 1) {
      if (n%2 == 0) n = n/2;
      else n = 3*n + 1;
      w += "->" + Integer.toString(n);
    }
    return w;
  }
}
```