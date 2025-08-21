https://www.codewars.com/kata/525e5a1cb735154b320002c8

## JavaScript
```js
function triangular( n ) {
  if (n<=0) return 0
  return n*(n+1)/2
}
```

## Java
```java
public class Triangular {
  public static long triangular(long n) {
    if (n<=0) return 0;
    return n*(n+1)/2;
  }
}
```

## Python
```python
def triangular(n: int):
  if n<=0: return 0
  return n*(n+1)//2
```

## SQL
```sql
SELECT 
  n,
  CASE
    WHEN n<=0 THEN 0
    ELSE n*(n+1)/2
  END
  AS res
FROM triangular
```

## TypeScript
```ts
export function triangular(n: number): number {
  return n<=0 ? 0 : n*(n+1)/2
}
```