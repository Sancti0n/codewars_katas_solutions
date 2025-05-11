https://www.codewars.com/kata/5809b62808ad92e31b000031

## Python
```python
def calculate(s):
    s = (s.replace("plus", "+")).replace("minus", "-")
    return str(eval(s))
```

## JavaScript
```js
function calculate(str) {
  return eval(str.replace(/plus/g, '+').replace(/minus/g, '-')).toString()
}
```