https://www.codewars.com/kata/58712dfa5c538b6fc7000569

## Java
```java
public class BeadsCounter {
    public static int countRedBeads(final int nBlue) {
      if (nBlue<2) return 0; 
      return 2*(nBlue-1);
    }
}
```

## Python
```python
def count_red_beads(n):
    if n<2: return 0
    return 2*(n-1)
```

## PHP
```php
function count_red_beads(int $n): int {
  return $n == 0 ? 0 : ($n - 1) * 2;
}
```

## JavaScript
```js
function countRedBeads(n) {
  return n === 0 ? 0 : (n-1)*2
}
```