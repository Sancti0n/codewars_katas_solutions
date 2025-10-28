https://www.codewars.com/kata/55a5bfaa756cfede78000026

## PHP
```php
function problem($x){
  if (gettype($x) == "string") return "Error";
  return $x*50+6;
}
```

## JavaScript
```js
function problem(x){
  if (typeof x == "string") return "Error"
  return x*50+6
}
```

## Python
```python
def problem(a):
    if type(a) is str: return "Error"
    return a*50+6
```