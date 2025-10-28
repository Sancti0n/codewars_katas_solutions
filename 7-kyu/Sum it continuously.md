https://www.codewars.com/kata/59b44d00bf10a439dd00006f

## Python
```python
def add(lst):
    t = []
    for i in range(len(lst)):
        t.append(sum(lst[:i+1]))
    return t
```

## JavaScript
```js
function sumArr(a) {
  return a.reduce((p, c) => p + c, 0)
}

function add(arr) {
  let t = [];
  for (let i=0;i<arr.length;i++) {
    t.push(sumArr(arr.slice(0,i+1)))
  }
  return t
}
```