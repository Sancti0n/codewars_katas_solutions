https://www.codewars.com/kata/5513795bd3fafb56c200049e

## JavaScript
```js
function countBy(x, n) {
  let t = []
  let i = x
  while (i<=x*n) {
    t.push(i)
    i += x
  }
  return t
}
```

## Python
```python
def count_by(x, n):
    return [i * x for i in range(1, n + 1)]
```

## PHP
```php
function countBy($x, $n) {
    return range($x, $n*$x, $x);
}
```

## Java
```java
import java.util.Arrays;

public class Kata{
  public static int[] countBy(int x, int n){
    int[] arr = new int[n];
    Arrays.setAll(arr, (index) -> (1 + index)*x);
    return arr;
  }
}
```

## TypeScript
```ts
export function countBy(x: number, n: number): number[] {
  let t = [], i = x;
  while (i<=x*n) {
    t.push(i);
    i += x;
  }
  return t
}
```