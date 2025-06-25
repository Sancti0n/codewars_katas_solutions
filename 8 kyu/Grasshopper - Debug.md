https://www.codewars.com/kata/55cb854deb36f11f130000e1

## Python
```python
def convert_to_celsius (temperature):
    return (temperature - 32)*(5/9)

def weather_info (temp):
    c = convert_to_celsius(temp)
    if (c > 0): return str(c) + " is above freezing temperature"
    return str(c) + " is freezing temperature"
```

## PHP
```php
function weatherInfo(int $temp): string {
  $c = convertToCelsius($temp);
  if($c > 0) return ($c." is above freezing temperature");
  return ($c . " is freezing temperature");
}
    
function convertToCelsius(int $temperature): int {
  return ($temperature - 32)*(5/9);
} 
```

## JavaScript
```js
function weatherInfo (temp) {
  var c = convertToCelsius(temp)
  if (c > 0) return c + " is above freezing temperature"
  return c + " is freezing temperature"
}

function convertToCelsius (temperature) {
  return (temperature - 32)*(5/9)
}
```

## Java
```java
public class GrassHopper {
  public static String weatherInfo(int temp) {
    double c = convertToCelsius(temp);
    if (c > 0) return (c + " is above freezing temperature");
    return (c + " is freezing temperature");
  }
  public static double convertToCelsius(int temperature) {
    return (double) (temperature-32)*5/9;
  }
}
```