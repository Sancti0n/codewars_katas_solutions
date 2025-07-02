https://www.codewars.com/kata/628e3ee2e1daf90030239e8a

## Python
```python
def interlockable(a, b):
    if a & b == 0: return True
    return False
```

## PHP
```php
function interlockable($a, $b) {
  return !($a&$b);
}
```

## JavaScript
```js
function interlockable(a, b) {
  return !(a&b)
}
```

## Java
```java
public class Kata {
  public static boolean interlockable(long a, long b) {
    return (a&b) == 0 ? true: false;
  }
}
```

## TypeScript
```ts
export function interlockable(a: bigint, b: bigint): boolean {
  return !(a&b)
}
```