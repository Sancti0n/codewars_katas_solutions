https://www.codewars.com/kata/5a512f6a80eba857280000fc

## PHP
```php
function NthSmallest($arr, $pos) {
  sort($arr);
  return $arr[$pos-1];
}
```

## Python
```python
def nth_smallest(arr, pos):
    arr.sort()
    return arr[pos-1]
```

## JavaScript
```js
function compareNumbers(a, b) {return a-b}

function nthSmallest(arr, pos){
  return arr.sort(compareNumbers)[pos-1]
}
```

## Java
```java
import java.util.Arrays;

public class Kata {
  public static int nthSmallest(final int[] arr, final int n) {
    Arrays.sort(arr);
    return arr[n-1];
  }
}
```

## TypeScript
```ts
export function compareNumbers(a: number, b: number) {
  return a-b
}

export function nthSmallest(arr: number[], pos: number) {
  return arr.sort(compareNumbers)[pos-1]
}
```