https://www.codewars.com/kata/6965d769930fb2eff921668f

## Python
```py
def solution(first, second):
    a, b, temp = [first, second, 0]
    while b - a <= a:
        temp = a
        a = b - a
        b = temp
    return (a, b)
```

## JavaScript
```js
function solution(first,second) {
  let a = first, b = second, temp = 0;
  while (b-a<=a) {
    temp = a;
    a = b - a;
    b = temp;
  }
  return [a, b]
}
```

## Java
```java
public class Kata {
  public static int[] solution(int a, int b) {
    int temp = 0;
    while (b-a<=a) {
      temp = a;
      a = b - a;
      b = temp;
    }
    return new int[] {a, b};
  }
}
```

## PHP
```php
function solution(int $a, int $b): array {
  $temp = 0;
  while ($b-$a<=$a) {
    $temp = $a;
    $a = $b - $a;
    $b = $temp;
  }
  return [$a, $b];
}
```

## TypeScript
```ts
export function solution(a: number, b: number): [number, number] {
  let temp = 0;
  while (b-a<=a) {
    temp = a;
    a = b - a;
    b = temp;
  }
  return [a, b]
}
```