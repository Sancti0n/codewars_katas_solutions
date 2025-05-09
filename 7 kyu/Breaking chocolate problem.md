https://www.codewars.com/kata/534ea96ebb17181947000ada

## Python
```python
def break_chocolate(n, m):
    return (n*m)-1 if n*m>0 else 0
```

## JavaScript
```js
function breakChocolate(n,m) {
  return Math.max((n*m)-1,0)
}
```

## PHP
```php
function breakChocolate ($n, $m) {
  return max(($n*$m)-1,0);
};
```

## Java
```java
public class Chocolate{
  public static long breakChocolate(long n, long m) {
    return Math.max((n*m)-1,0);
  }
}
```