https://www.codewars.com/kata/55a75e2d0803fea18f00009d

## Python
```python
def find_slope(p):
    return "undefined" if p[2]==p[0] else str(int((p[3]-p[1])/(p[2]-p[0])))
```

## JavaScript
```js
function slope(p) {
  return p[2]==p[0] ? "undefined" : ((p[3]-p[1])/(p[2]-p[0])).toString()
}
```

## Java
```java
public class Slope {
  public String slope(int[] p) {
    return p[2]==p[0] ? "undefined" : String.valueOf((p[3]-p[1])/(p[2]-p[0]));
  }
}
```