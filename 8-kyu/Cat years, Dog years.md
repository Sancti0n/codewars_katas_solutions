https://www.codewars.com/kata/5a6663e9fd56cb5ab800008b

## Python
```python
def human_years_cat_years_dog_years(h):
    if h == 1: return [1,15,15]
    if h == 2: return [2,24,24]
    return [h,15+9+4*(h-2),15+9+5*(h-2)]
```

## JavaScript
```js
var humanYearsCatYearsDogYears = function(h) {
  if (h == 1) return [1,15,15]
  if (h == 2) return [2,24,24]
  return [h,15+9+4*(h-2),15+9+5*(h-2)]
}
```

## Java
```java
public class Dinglemouse {
    public static int[] humanYearsCatYearsDogYears(final int h) {
        if (h == 1) return new int[]{1, 15, 15};
        if (h == 2) return new int[]{2,24,24};
        return new int[]{h,15+9+4*(h-2),15+9+5*(h-2)};
    }
}
```