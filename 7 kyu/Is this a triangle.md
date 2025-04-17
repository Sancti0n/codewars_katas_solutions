https://www.codewars.com/kata/56606694ec01347ce800001b

## Python
```python
def is_triangle(a, b, c):
    v = [a,b,c]
    if sum(list(v)) - 2*max(v)> 0: return True
    return False
```

## JavaScript
```js
function isTriangle(a,b,c){
    let v = [a,b,c]
    let i = 0
    return v.reduce((a,b)=>a+b,i)-2*Math.max(...v)>0
}
```

## Java
```java
import java.util.Arrays;

class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    int t[] = {a, b, c};
    Arrays.sort(t);
    return a+b+c > 2*t[t.length-1];
  }
}
```

## PHP
```php
function isTriangle(int $a, int $b, int $c): bool{
  $t = [$a,$b,$c];
  sort($t);
  return $a+$b+$c > 2*$t[count($t)-1];
}
```