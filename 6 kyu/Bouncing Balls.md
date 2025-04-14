https://www.codewars.com/kata/5544c7a5cb454edb3c000047/

## Python
```python
def bouncing_ball(h, bounce, window):
    if h<0 or bounce<=0 or bounce>=1 or window<0 or window>=h: return -1
    c = 0
    while h>window:
        h *= bounce
        if h>window: c += 2
    return c + 1
```

## JavaScript
```js
function bouncingBall(h, bounce, window) {
  if (h<0 || bounce<=0 || bounce>=1 || window<0 || window>=h) return -1
  let c = 0;
  while (h>window) {
    h *= bounce;
    if (h>window) c += 2;
  }
  return c + 1
}
```

## Java
```java
public class BouncingBall {
  public static int bouncingBall(double h, double bounce, double window) {
    if (h<0 || bounce<=0 || bounce>=1 || window<0 || window>=h) return -1;
    int c = 0;
    while (h>window) {
      h *= bounce;
      if (h>window) c += 2;
    }
    return c + 1;
  }
}
```

## PHP
```php
function bouncingBall($h, $bounce, $window) {
  if ($h<0 || $bounce<=0 || $bounce>=1 || $window<0 || $window>=$h) return -1;
  $c = 0;
  while ($h>$window) {
    $h *= $bounce;
    if ($h>$window) $c += 2;
  }
  return $c + 1;
}
```