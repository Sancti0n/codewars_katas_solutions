https://www.codewars.com/kata/5cd5ba1ce4471a00256930c0

## Python
```python
def solution(n,d):
    if d<0: return []
    return list(map(int,str(n)))[::-1][:d][::-1]
```

## JavaScript
```js
function lastDigit(n, d) {
  if (d<0) return []
  return n.toString().substring(n.toString().length-d).split("").map(Number)
}
```