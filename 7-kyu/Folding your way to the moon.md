https://www.codewars.com/kata/58f0ba42e89aa6158400000e

## Python
```python
def fold_to(distance):
    if distance<0: return None
    p, i = [0.0001, 0]
    while p*2**i<=distance: i += 1
    return i
```

## JavaScript
```js
function foldTo(d) {
  if (d<0) return null
  let p = 0.0001, i = 0;
  while (p*2**i<=d) i++;
  return i
}
```

## PHP
```php
function fold_to($d) {
  if ($d<0) return null;
  $p = 0.0001;
  $i = 0;
  while ($p*2**$i<=$d) $i++;
  return $i;
}
```

## Java
```java
public class PaperFolder {
  public static Long fold(Double d) {
    if (d<0) return null;
    double p = 0.0001;
    double i = 0;
    while (p*Math.pow(2,i)<d) i++;
    return (long) i;
  }
}
```