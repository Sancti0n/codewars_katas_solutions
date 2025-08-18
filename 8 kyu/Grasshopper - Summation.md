https://www.codewars.com/kata/55d24f55d7dd296eb9000030

## Python
```python
def summation(n):
    return n*(n+1)/2
```

## PHP
```php
function summation($n) {
  return $n*($n+1)/2;
}
```

## JavaScript
```js
var summation = function (n) {
  return n*(n+1)/2
}
```

## Java
```java
public class GrassHopper {
  public static int summation(int n) {
    return n*(n+1)/2;
  }
}
```

## SQL
```sql
-- # write your SQL statement here: you are given a table 'kata' with a column 'n', return a table with 'n' and your result stored in a column naed 'res'.
SELECT n,n*(n+1)/2 AS res FROM kata
```

## TypeScript
```ts
export const summation = (n:number)=> { 
  return n*(n+1)/2
}
```