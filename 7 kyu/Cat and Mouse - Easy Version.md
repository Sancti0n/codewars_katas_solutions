https://www.codewars.com/kata/57ee24e17b45eff6d6000164

## Python
```python
def cat_mouse(x):
    return 'Caught!' if x.count('.')<4 else 'Escaped!'
```

## JavaScript
```js
function catMouse(x) {
  return x.length-x.split(".").join("").length<4 ? "Caught!": "Escaped!"
}
```

## PHP
```php
function cat_mouse(string $s): string {
  return strlen($s)<6 ? "Caught!": "Escaped!";
}
```