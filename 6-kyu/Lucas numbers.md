https://www.codewars.com/kata/55a7de09273f6652b200002e

## Python
```python
def lucasnum(n):
    v = abs(n)
    if n == 0: return 2
    if abs(n) == 1:
        return -1 if n<0 else 1
    i, s, a, b = [2, 0, 2, 1]
    while i<=v:
        s = b + a
        i += 1
        a = b
        b = s
    return -s if n<0 and n%2 == 1 else s
```

## JavaScript
```js
function lucasnum(n) {
  if (n == 0) return 2
  if (Math.abs(n) == 1) return n<0 ? -1: 1
  let v = Math.abs(n);
  let i = 2, s = 0, a = 2, b = 1;
  while (i<=v) {
    s = b + a;
    i++;
    a = b;
    b = s;
  }
  return (n<0 && Math.abs(n%2) == 1) ? -s: s
}
```

## Java
```java
public class Lucas {
  public static int lucasnum (int n) {
    if (n == 0) return 2;
    if (Math.abs(n) == 1) return n<0 ? -1: 1;
    int v = Math.abs(n);
    int i = 2, s = 0, a = 2, b = 1;
    while (i<=v) {
      s = b + a;
      i++;
      a = b;
      b = s;
    }
    return (n<0 && Math.abs(n%2) == 1) ? -s: s;
  }
}
```