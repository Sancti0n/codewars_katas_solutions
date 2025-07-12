https://www.codewars.com/kata/5708f682c69b48047b000e07

## Python
```python
def multiply(n):
    a = len(str(abs(n)))
    return n * 5**a
```

## JavaScript
```js
function multiply(n){
  return n*5**Math.abs(n).toString().length
}
```