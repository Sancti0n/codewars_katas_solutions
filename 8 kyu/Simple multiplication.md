https://www.codewars.com/kata/583710ccaa6717322c000105

## TypeScript
```ts
export function simpleMultiplication(num: number): number {
  return num%2 ? num*9 : num*8
}
```

## Python
```python
def simple_multiplication(number):
    if number%2: return number*9
    return number*8
```

## PHP
```php
function simpleMultiplication($number) {
  if ($number%2) return $number*9;
  return $number*8;
}
```

## JavaScript
```js
function simpleMultiplication(number) {
  if (number%2) return number*9
  return number*8
}
```

## Java
```java
public class Sid {
  public static int simpleMultiplication(int n) {
    if (n%2 == 1) return n*9;
    return n*8;
  }
}
```

## SQL
```sql
SELECT 
  number,
  CASE
    WHEN number%2 = 1 THEN number*9
    ELSE number*8
  END
  AS res
FROM multiplication
```