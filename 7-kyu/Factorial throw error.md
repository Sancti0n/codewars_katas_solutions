https://www.codewars.com/kata/54ff0d1f355cfd20e60001fc

## Python
```python
def factorial(n):
    if n<0 or n>12: raise ValueError('throw error')
    if n == 0: return 1
    return n*factorial(n-1)
```

## PHP
```php
function factorial(int $n): int {
  if ($n<0 or $n>12) throw new RangeException("Error");;
    if ($n == 0) return 1;
    return $n*factorial($n-1);
}
```

## JavaScript
```js
function factorial(n) {
  if (n<0 || n>12) throw new RangeError("Error");
  if (n == 0) return 1
  return n*factorial(n-1)
}
```

## Java
```java
public class Factorial {
  public int factorial(int n) {
    if (n<0 || n>12) throw new IllegalArgumentException();
    if (n == 0) return 1;
    return n*factorial(n-1);
  }
}
```