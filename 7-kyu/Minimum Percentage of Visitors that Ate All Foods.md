https://www.codewars.com/kata/657e578bdc80170abd4dca79

## Python
```py
def minimum_percentage(foods):
    s = sum([100 - i for i in foods])
    return 100 - s  if s <= 100 else 0
```

## JavaScript
```js
function minimumPercentage(foods) {
  let s = 0;
  for (let i=0;i<foods.length;i++) {
    s += 100 - foods[i];
  }
  return s > 100 ? 0 : 100 - s;
}
```

## TypeScript
```ts
export function minimumPercentage(foods: number[]): number {
  let s = 0;
  for (let i=0;i<foods.length;i++) {
    s += 100 - foods[i];
  }
  return s > 100 ? 0 : 100 - s;
}
```

## Java
```java
public class Kata {
  public static int minimumPercentage(int[] foods) {
    int s = 0;
    for (int i=0;i<foods.length;i++) {
      s += 100 - foods[i];
    }
    return s > 100 ? 0 : 100 - s;
  }
}
```