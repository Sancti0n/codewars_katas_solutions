https://www.codewars.com/kata/5866e6992e8d9cdbcd00040a

## JavaScript
```js
function convertCF(num, scale) {
  if (scale == "f") return (num*9/5)+32
  if (scale == "c" || !scale) return (num-32)/9*5
  throw new Error("Error");
}
```

## PHP
```php
function convert_c_f($num, $scale="") {
  if ($scale == "f") return ($num*9/5)+32;
  if ($scale == "c" || !$scale) return ($num-32)/9*5;
  throw new InvalidArgumentException();
}
```