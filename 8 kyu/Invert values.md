https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad

## Python
```python
def invert(lst):
    if lst == []: return []
    for i in range(len(lst)):
        lst[i] = -lst[i]
    return lst
```

## PHP
```php
function invert(array $a): array {
  if ($a == []) return $a;
  for ($i=0;$i<count($a);$i++) $a[$i] = -$a[$i];
  return $a;
}
```

## JavaScript
```js
function invert(array) {
   return array.map(x => -x)
}
```

## Java
```java
public class Kata {
  public static int[] invert(int[] array) {
    if (array.length == 0) return array;
    for (int i=0;i<array.length;i++) {
      array[i] = -array[i];
    }
    return array;
  }
}
```

## TypeScript
```ts
export function invert(array: number[]): number[] {
  return array.map(x => -x)
}
```