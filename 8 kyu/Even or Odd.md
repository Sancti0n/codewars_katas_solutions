https://www.codewars.com/kata/53da3dbb4a5168369a0000fe

## Python
```python
def even_or_odd(number):
    return 'Odd' if number%2 else 'Even'
```

## JavaScript
```js
function even_or_odd(number) {
  return number%2 ? 'Odd': 'Even'
}
```

## PHP
```php
function even_or_odd(int $n): string {
  return $n%2 == 0 ? 'Even' : 'Odd';
}
```

## Java
```java
public class EvenOrOdd {
  public static String even_or_odd(int number) {
    return number%2 == 0 ? "Even":"Odd";
  }
}
```

## SQL
```sql
SELECT number,
  CASE
    WHEN MOD(number,2)=0 THEN 'Even'
    ELSE 'Odd'
  END
AS is_even FROM numbers
```

## TypeScript
```ts
export function evenOrOdd(n:number):string {
  return n%2 ? 'Odd': 'Even'
}
```