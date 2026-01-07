https://www.codewars.com/kata/55e6f5e58f7817808e00002e

## Python
```python
def seven(m):
    c = 0
    while m>=100:
        m = m//10 
          - 2*(int(str(m)[len(str(m))-1]))
        c += 1
    return (m, c)
```

## PHP
```php
function seven($m) {
  $c = 0;
  while ($m>=100) {
    $m = floor($m/10) 
      - 2*(intval(strval($m)[strlen(strval($m))-1]));
    $c++;
  }
  return [$m,$c];
}
```

## JavaScript
```js
function seven(m) {
  let c = 0;
  while (m>99) {
    m = Math.trunc(m/10)
    - 2*(parseInt(m.toString()[m.toString().length-1]));
    c++;
  }
  return [m,c]
}
```

## Java
```java
class DivSeven {
  public static long[] seven(long m) {
    long c = 0;
    while (m>99) {
      m = m/10 
      - 2*(Long.parseLong(
          String.valueOf(m).substring(
            String.valueOf(m).length()-1)
            )
          );
      c++;
    }
    return new long[] {m,c};
  }
}
```

## TypeScript
```ts
export function seven(m: number): number[] {
  let c = 0;
  while (m>99) {
    m = Math.trunc(m/10) 
    - 2*(parseInt(
        m.toString()[m.toString().length-1])
        );
    c++;
  }
  return [m,c]
}
```