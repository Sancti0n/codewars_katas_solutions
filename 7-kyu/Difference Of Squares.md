https://www.codewars.com/kata/558f9f51e85b46e9fa000025

## Python
```python
def sumOfPower(n):
    return n*(n+1)*(2*n+1)/6

def sumOfN(n):
    return n*(n+1)/2

def difference_of_squares(n):
    return sumOfN(n)**2-sumOfPower(n)
```

## JavaScript
```js
function sumOfPower(n) {
  return n*(n+1)*(2*n+1)/6
}

function sumOfN(n) {
  return n*(n+1)/2
}

function differenceOfSquares(n) {
  return sumOfN(n)**2-sumOfPower(n)
}
```

## PHP
```php
function sumOfPower($n) {
  return $n*($n+1)*(2*$n+1)/6;
}

function sumOfN($n) {
  return $n*($n+1)/2;
}

function difference_of_squares(int $n): int {
  return sumOfN($n)**2-sumOfPower($n);
}
```