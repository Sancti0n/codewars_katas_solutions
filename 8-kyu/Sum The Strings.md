https://www.codewars.com/kata/5966e33c4e686b508700002d

## Python
```python
def sum_str(a, b):
    if a == '': a = 0
    if b == '': b = 0
    return str(int(a)+int(b))
```

## JavaScript
```js
function sumStr(a,b) {
  if (a == "") a = 0;
  if (b == "") b = 0;
  return (eval(a)+eval(b)).toString()
}
```