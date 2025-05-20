https://www.codewars.com/kata/5949481f86420f59480000e7

## Python
```python
def odd_or_even(arr):
    if sum(arr)%2 == 1: return "odd"
    return "even"
```

## Java
```java
public class Codewars {
  public static String oddOrEven (int[] arr) {
    int sum = 0;
    for (int i=0;i<arr.length;i++) sum = sum + arr[i];
    if (sum%2 == 1) return "odd";
    return "even";
  }
}
```

## JavaScript
```js
function oddOrEven(arr) {
  return Math.abs(arr.reduce((p,c) => p+c, 0))%2 == 1 ? "odd":"even"
}
```

## PHP
```php
function odd_or_even(array $a): string {
  return array_sum($a)%2 ? "odd":"even";
}
```