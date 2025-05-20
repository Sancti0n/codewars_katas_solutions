https://www.codewars.com/kata/5287e858c6b5a9678200083c

## JavaScript
```js
function narcissistic(value) {
  let s = 0;
  let v = value.toString();
  for (let i=0;i<v.length;i++) {
    s += Math.pow(v[i], v.length);
  }
  return s === value
}
```

## Python
```python
def narcissistic(value):
    x = sum([int(str(value)[i])**len(str(value)) for i in range(len(str(value)))])
    return x == value
```

## PHP
```php
function narcissistic(int $value): bool {
  $s = 0;
  $v = strval($value);
  for ($i=0;$i<strlen($v);$i++) {
    $s += pow($v[$i], strlen($v));
  }
  return $s == $value;
}
```

## Java
```java
public class NumberUtils {
  public static boolean isNarcissistic(int number) {
    int s = 0;
    String[] v = String.valueOf(number).split("");
    for (int i=0;i<v.length;i++) {
      s += Math.pow(Double.parseDouble(v[i]), (double)v.length);
    }
    return s == number;
  }
}
```