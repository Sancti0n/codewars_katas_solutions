https://www.codewars.com/kata/5ab6538b379d20ad880000ab

## JavaScript
```js
const areaOrPerimeter = function(l , w) {
  return l == w ? l*w : 2*(l+w)
};
```

## Python
```python
def area_or_perimeter(l, w):
    if (l==w): return l*l
    return (l+w)*2
```

## PHP
```php
function areaOrPerimeter (int $l, int $w){
  if ($l==$w) return $l*$l;
  return ($l+$w)*2;
}
```

## Java
```java
public class Solution {
    public static int areaOrPerimeter (int l, int w) {
      if (l==w) return l*l;
      return (l+w)*2;
    }
}
```