https://www.codewars.com/kata/5844a422cbd2279a0c000281

## JavaScript
```js
function multi(arr) {
  return arr.reduce((a, b)=> a*b, 1)
}
function add(arr) {
  return arr.reduce((p, c) => p + c, 0)
}
function reverse(str) {
  return str.split("").reduce((a,b)=> a = b + a ,"")
}
```

## Python
```python
import math

def multi(l_st):
    return math.prod(l_st)
def add(l_st):
    return sum(l_st)
def reverse(string):
    return string[::-1]
```

## PHP
```php
function multi($array) {
  return array_product($array);
}
function add($array) {
  return array_sum($array);
}
function reverse($string) {
  return strrev($string);
}
```