https://www.codewars.com/kata/57a0e5c372292dd76d000d7e

## SQL
```sql
SELECT s, n, REPEAT(s, n) AS res FROM repeatstr
```

## Python
```python
def repeat_str(repeat, string):
    return string*repeat
```

## PHP
```php
function repeatStr($n, $str) {
  return str_repeat($str, $n);
}
```

## JavaScript
```js
function repeatStr (n, s) {
  return s.repeat(n)
}
```

## Java
```java
public class Solution {
  public static String repeatStr(final int repeat, final String string) {
    return string.repeat(repeat);
  }
}
```

## TypeScript
```ts
export function repeatStr(n: number, s: string): string {
  return s.repeat(n)
}
```