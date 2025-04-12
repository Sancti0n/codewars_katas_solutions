Return the magnitude of a vector, given as an array of its component values.

The vector (2, 3, 5) would be represented as an array containing three values at indices 0, 1 and 2 respectively.
The array will always contain at least 2 and at most 100 elements (2 ≤ vector.Length ≤ 100), each of which will be within the range [-100, 100].
An array containing four elements represents a vector in 4D space.

More info on finding the length of a vector: http://farside.ph.utexas.edu/teaching/301/lectures/node28.html

## Python
```python
def magnitude(vector):
    s = 0
    for i in vector:
        s += i**2
    return s**.5
```

## JavaScript
```js
function magnitude(vector) {
  let s = 0;
  for (let i=0;i<vector.length;i++) {
    s += vector[i]**2;
  }
  return s**.5
}
```

## Java
```java
public class Kata {
  public static double magnitude(double[] vector) {
    double s = 0;
    for (int i=0;i<vector.length;i++) {
      s += Math.pow(vector[i], 2);
    }
    return Math.pow(s, 0.5);
  }
}
```

## PHP
```php
function magnitude($vector) {
  $s = 0;
  for ($i=0;$i<count($vector);$i++) {
    $s += $vector[$i]**2;
  }
  return $s**.5;
}
```