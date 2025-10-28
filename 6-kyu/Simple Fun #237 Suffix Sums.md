https://www.codewars.com/kata/590938089ff3d186cb00004c

## JavaScript
```js
function suffixSums(a) {
  let t = [];
  t.push(a.reduce((p, c) => p + c, 0));
  for (let i=1;i<a.length;i++) {
    t.push(t[i-1]-a[i-1]);
  }
  return t
}
```

## Python
```python
def suffix_sums(arr):
    t = [sum(arr)]
    for i in range(1, len(arr)):
        t.append(t[i-1]-arr[i-1])
    return t
```