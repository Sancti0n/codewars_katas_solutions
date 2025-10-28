https://www.codewars.com/kata/5913152be0b295cf99000001

## Python
```python
def divisions(n, divisor):
    if n<=divisor: return int(n/divisor)
    i = 0
    while n/divisor >= 1:
        n = int(n/divisor)
        i += 1
    return i
```

## JavaScript
```js
const divisions = (n, divisor) => {
  return parseInt(Math.log(n)/Math.log(divisor))
};
```