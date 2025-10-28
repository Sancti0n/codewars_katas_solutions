https://www.codewars.com/kata/563b1f55a5f2079dc100008a

## Python
```python
def get_larger_numbers(a, b):
    t = []
    for i in range(len(a)):
        t.append(max(a[i], b[i]))
    return t
```

## JavaScript
```js
function getLargerNumbers(a, b) {
  for (let i=0;i<a.length;i++) {
    a[i] = Math.max(a[i],b[i])
  }
  return a
}
```