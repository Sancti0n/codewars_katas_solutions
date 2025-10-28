https://www.codewars.com/kata/58acfe4ae0201e1708000075

## Python
```py
def invite_more_women(arr):
    return sum(arr)>0
```

## JavaScript
```js
function inviteMoreWomen(L) {
  return L.reduce((p, c) => p + c, 0)>0
}
```

## TypeScript
```ts
export function inviteMoreWomen (L: number[]): boolean {
  return L.reduce((p, c) => p + c, 0)>0
}
```

## PHP
```php
function invite_more_women(array $a): bool {
  return array_sum($a)>0;
}
```

## Java
```java
public class Kata {
  public static boolean inviteMoreWomen(int[] l) {
    int s = 0;
    for (int i=0;i<l.length;i++) s += l[i];
    return s>0;
  }
}
```