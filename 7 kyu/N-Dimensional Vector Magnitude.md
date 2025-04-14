https://www.codewars.com/kata/5806c2f897dba05dd900004c

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