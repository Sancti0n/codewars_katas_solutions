https://www.codewars.com/kata/57a429e253ba3381850000fb

## Python
```python
def bmi(weight, height):
    w = weight/height**2
    if w <= 18.5: return "Underweight"
    if w <= 25: return "Normal"
    if w <= 30: return "Overweight"
    return "Obese"
```

## JavaScript
```js
function bmi(weight, height) {
  let w = weight/height**2;
  if (w <= 18.5) return "Underweight"
  if (w <= 25) return "Normal"
  if (w <= 30) return "Overweight"
  return "Obese"
}
```

## Java
```java
public class Calculate {
  public static String bmi(double weight, double height) {
    double w = weight/Math.pow(height,2);
    if (w <= 18.5) return "Underweight";
    if (w <= 25) return "Normal";
    if (w <= 30) return "Overweight";
    return "Obese";
  }
}
```

## PHP
```php
function bmi($weight, $height) {
  $w = $weight/pow($height,2);
  if ($w <= 18.5) return "Underweight";
  if ($w <= 25) return "Normal";
  if ($w <= 30) return "Overweight";
  return "Obese";
}
```