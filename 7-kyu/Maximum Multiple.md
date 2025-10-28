https://www.codewars.com/kata/5aba780a6a176b029800041c

## SQL
```sql
select bound - bound%divisor as res from max_multiple
```

## Python
```python
def max_multiple(divisor, bound):
    n = bound
    for i in range(bound, 0, -1):
        if i/divisor == int(i/divisor): return i
```

## PHP
```php
function maxMultiple($divisor, $bound) {
  return $bound - ($bound % $divisor);
}
```

## JavaScript
```js
function maxMultiple(divisor, bound){
  return bound - (bound % divisor)
}
```

## Java
```java
public class MaxMultiple {
  public static int maxMultiple(int divisor, int bound) {
    return bound - (bound % divisor);
  }
}
```

## TypeScript
```ts
export function maxMultiple(divisor: number, bound: number): number {
  return bound - (bound % divisor)
}
```