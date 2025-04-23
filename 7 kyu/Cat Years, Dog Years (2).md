https://www.codewars.com/kata/5a6d3bd238f80014a2000187

## Python
```python
def owned_cat_and_dog(cat_years, dog_years):
    cat = 0 if cat_years<15 else 1 if cat_years<24 else 2 if cat_years<28 else 2 + (cat_years-24)/4
    dog = 0 if dog_years<15 else 1 if dog_years<24 else 2 if dog_years<28 else 2 + (dog_years-24)/5
    return [int(cat), int(dog)]
```

## JavaScript
```js
var ownedCatAndDog = function(c, d) {
  let cat = c<15 ? 0: c<24 ? 1: c<28 ? 2: 2 + (c-24)/4;
  let dog = d<15 ? 0: d<24 ? 1: d<28 ? 2: 2 + (d-24)/5;
  return [parseInt(cat), parseInt(dog)]
}
```

## Java
```java
public class Dinglemouse {
    public static int[] ownedCatAndDog(final int c, final int d) {
        int cat = c<15 ? 0: c<24 ? 1: c<28 ? 2: 2 + (c-24)/4;
        int dog = d<15 ? 0: d<24 ? 1: d<28 ? 2: 2 + (d-24)/5;
        return new int[]{cat, dog};
    }
}
```