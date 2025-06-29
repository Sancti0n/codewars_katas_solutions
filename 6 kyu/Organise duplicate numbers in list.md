https://www.codewars.com/kata/5884b6550785f7c58f000047

## Python
```python
def group(arr):
    t = []
    a = []
    for i in arr:
        if i not in a:
            t.append([i]*arr.count(i))
            a.append(i)
    return t
```

## JavaScript
```js
function countArr(a, b) {
  return a.filter(elt => elt === b).length
}

function group(arr) {
  let t = [], a = [];
  for (let i=0;i<arr.length;i++) {
    if (a.indexOf(arr[i])<0) {
      t.push(Array(countArr(arr, arr[i])).fill(arr[i]));
      a.push(arr[i]);
    }
  }
  return t
}
```