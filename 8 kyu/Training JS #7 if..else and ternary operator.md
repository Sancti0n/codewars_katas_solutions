https://www.codewars.com/kata/57202aefe8d6c514300001fd

## Java
```java
public class SaleHotdogs{
  public static int saleHotdogs(final int n){
    return (n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90)*n;
  }
}
```

## JavaScript
```js
function saleHotdogs(n){
  return (n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90)*n
}
```

## Python
```python
def sale_hotdogs(n):
    return 100*n if n<5 else 95*n if n>=5 and n<10 else 90*n
```

## TypeScript
```ts
export function saleHotdogs(n: number): number {
  return (n < 5 ? 100 : n >= 5 && n < 10 ? 95 : 90)*n
}
```