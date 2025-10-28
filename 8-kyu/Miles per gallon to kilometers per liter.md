https://www.codewars.com/kata/557b5e0bddf29d861400005d

## Python
```python
def converter(mpg):
    print(mpg)
    return round(mpg*0.354006, 2)
```

## JavaScript
```js
function converter (mpg) {
  return Number((mpg*0.354006).toFixed(2))
}
```

## Java
```java
public class Converter {
  public static float mpgToKPM(final float mpg) {
    return Math.round(mpg*(float)35.4006)/(float)100;
  }
}
```