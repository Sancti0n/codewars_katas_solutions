https://www.codewars.com/kata/59a8570b570190d313000037

## Python
```python
def sum_cubes(n):
    return sum([i**3 for i in range(1, n+1)])
```

## JavaScript
```js
function sumCubes(n){
  let t = [];
  for (let i=1;i<=n;i++) t.push(i**3);
  return t.reduce((p, c) => p + c, 0)
}
```

## PHP
```php
function sumCubes($n) {
  $t = [];
  for ($i=1;$i<=$n;$i++) $t[] = $i**3;
  return array_sum($t);
}
```

## Java
```java
import java.lang.Math;

public class Solution{
  public static long sumCubes(long n) {
    long v = 0;
    for (long i=1;i<=n;i++) v += (long) Math.pow(i, 3);
    return v;
  }
}
```