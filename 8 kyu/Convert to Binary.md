https://www.codewars.com/kata/59fca81a5712f9fa4700159a

## Python
```python
def to_binary(n):
    return int(format(n, "b"))
```

## JavaScript
```js
function toBinary(n){
  return parseInt(n.toString(2));
}
```

## Java
```java
public class Kata {
  public static int toBinary(int n) {
    String w = "";
    if (n<2) return n;
    while (n != 0) {
      w = String.valueOf(n%2) + w;
      n = n/2;
    }
    return Integer.parseInt(w);
  }
}
```