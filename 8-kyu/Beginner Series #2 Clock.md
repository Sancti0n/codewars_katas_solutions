https://www.codewars.com/kata/55f9bca8ecaa9eac7100004a

## TypeScript
```ts
export function past(h: number, m: number, s: number): number {
  return 1000*(h*3600+m*60+s)
}
```

## Python
```python
def past(h, m, s):
    return 1000*(h*3600+m*60+s)
```

## PHP
```php
function past($h, $m, $s) {
  return 1000*($h*3600+$m*60+$s);
}
```

## JavaScript
```js
function past(h, m, s){
  return 1000*(h*3600+m*60+s)
}
```

## Java
```java
public class Clock {
  public static int Past(int h, int m, int s) {
    return 1000*(h*3600+m*60+s);
  }
}
```

## SQL
```sql
select 1000*(h*3600 + m*60 + s) as res from past
```