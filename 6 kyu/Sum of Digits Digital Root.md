https://www.codewars.com/kata/541c8630095125aba6000c00

## JavaScript
```js
function digital_root(n) {
  return (n - 1) % 9 + 1;
}
```

## Python
```python
def digital_root(n):
    if n == 0: return 0
    else: return (n-1)%9 + 1
```

## Java
```java
public class DRoot {
  public static int digital_root(int n) {
    return (n - 1) % 9 + 1;
  }
}
```

## PHP
```php
function digital_root($n): int {
  return ($n - 1) % 9 + 1;
}
```

## TypeScript
```ts
export const digitalRoot = (n:number):number => {
  return (n - 1)%9 + 1;
};
```