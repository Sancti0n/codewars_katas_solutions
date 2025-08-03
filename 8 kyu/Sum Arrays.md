https://www.codewars.com/kata/53dc54212259ed3d4f00071c

## Python
```python
def sum_array(a):
    return sum(a)
```

## JavaScript
```js
function sum (numbers) {
    "use strict";
    return numbers.reduce((p, c) => p + c, 0)
};
```

## PHP
```php
function sum(array $a): float {
  return array_sum($a);
}
```

## Java
```java
public class SumArray {

  public static double sum(double[] numbers) {
    double sum = 0;
    for (double value : numbers) {
        sum += value;
    }
    return sum;
  }
}
```