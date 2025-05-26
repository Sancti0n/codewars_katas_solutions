https://www.codewars.com/kata/59811fd8a070625d4c000013

## Python
```python
def integrate(coefficient, exponent):
    return str(int(coefficient/(exponent+1)))+'x^'+str(exponent+1)
```

## JavaScript
```js
function integrate(coefficient, exponent) {
  return (parseInt(coefficient/(exponent+1))).toString()+'x^'+(exponent+1).toString()
}
```

## Java
```java
public class Kata {
    public static String integrate(int coefficient, int exponent) {
        return String.valueOf(coefficient/(exponent+1))+"x^"+String.valueOf(exponent+1);
    }
}
```