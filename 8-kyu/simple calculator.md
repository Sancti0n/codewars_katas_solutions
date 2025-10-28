https://www.codewars.com/kata/5810085c533d69f4980001cf

## Python
```python
def calculator(x,y,op):
    if op in ['+', '-', '*', '/'] and str(x).isnumeric() and str(y).isnumeric(): return eval(str(x)+op+str(y))
    return 'unknown value'
```

## JavaScript
```js
function calculator(a,b,sign){
  if (['+', '-', '*', '/'].indexOf(sign)>-1 && !isNaN(a) && !isNaN(b)) return eval(a+sign+b)
    return 'unknown value'
}
```

## PHP
```php
function calculator($a, $b, $op) {
  if (in_array($op, ["+", "-", "*", "/"]) && is_numeric(strval($a)) && is_numeric(strval($b)) && gettype($a) != "string" && gettype($b) != "string") {
    return eval("return ".strval($a).$op.strval($b).";");
  }
  return "unknown value";
}
```