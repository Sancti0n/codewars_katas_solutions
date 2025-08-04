https://www.codewars.com/kata/56f69d9f9400f508fb000ba7

## PHP
```php
function monkeyCount($n) {
  if ($n<=1) return [1];
  return range(1,$n);
}
```

## Python
```python
def monkey_count(n):
    return list(range(1,n+1))
```

## JavaScript
```js
function monkeyCount(n) {
  return [...Array(n+1).keys()].slice(1)
}
```

## Java
```java
import java.util.Arrays;

public class MonkeyCounter {
  public static int[] monkeyCount(final int n){
    
    int[] arr = new int[n];
    Arrays.setAll(arr, i->i+1);
    return arr;
  }
}
```

## TypeScript
```ts
export function monkeyCount(n: number) {
  return [...Array(n+1).keys()].slice(1);
}
```