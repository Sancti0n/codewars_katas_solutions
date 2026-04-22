https://www.codewars.com/kata/563b74ddd19a3ad462000054

## Python
```py
def stringy(size):
    return ('10' * size)[:size]
```

## JavaScript
```js
function stringy(size) {
  return '10'.repeat(size/2)+'1'.repeat(size%2)
}
```

## Java
```java
public class Kata {
  public static String stringy(int size) {
    return "10".repeat(size/2)+"1".repeat(size%2);
  }
}
```

## TypeScript
```ts
export const stringy = (n: number): string => '10'.repeat(n/2)+'1'.repeat(n%2)
```