https://www.codewars.com/kata/5729c30961cecadc4f001878

## JavaScript
```js
function uniteUnique(...arr) {
  let t = [...new Set(arr[0])];
  for (let i=1;i<arr.length;i++) {
    for (let j=0;j<arr[i].length;j++) {
      if (t.indexOf(arr[i][j])<0) t.push(arr[i][j]);
    }
  }
  return t
}
```

## Python
```python
def unite_unique(*arr):
    t = list(dict.fromkeys(arr[0]))
    for i in range(1,len(arr)):
        for j in arr[i]:
            if j not in t: t.append(j)
    return t
```