https://www.codewars.com/kata/5bb0c58f484fcd170700063d

## Python
```python
def pillars(num_pill, dist, width):
    if num_pill == 1: return 0
    else: return (num_pill-1)*dist*100 + (num_pill-2)*width
```

## JavaScript
```js
function pillars(numPill, dist, width) {
  if (numPill == 1) return 0
  return (numPill-1)*dist*100 + (numPill-2)*width
}
```

## PHP
```php
function pillars($num_pill, $dist, $width) {
  if ($num_pill == 1) return 0;
  return ($num_pill-1)*$dist*100 + ($num_pill-2)*$width;
}
```

## Java
```java
public class Kata{
  public static int pillars(int numPill, int dist, int width){
    if (numPill == 1) return 0;
    else return (numPill-1)*dist*100 + (numPill-2)*width;
  }
}
```