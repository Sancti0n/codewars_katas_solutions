https://www.codewars.com/kata/643af0fa9fa6c406b47c5399

## JavaScript
```js
function quadrant(x, y) {
  if (x>0 && y>0) return 1
  if (x>0 && y<0) return 4
  if (x<0 && y>0) return 2
  return 3
}
```

## Java
```java
public class Kata {
  
  public static int quadrant(int x, int y) {
    if (x>0 && y>0) return 1;
    if (x>0 && y<0) return 4;
    if (x<0 && y>0) return 2;
    return 3;
  }
}
```

## Python
```python
def quadrant(x, y):
    if x>0 and y>0: return 1
    if x>0 and y<0: return 4
    if x<0 and y>0: return 2
    return 3
```