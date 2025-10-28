https://www.codewars.com/kata/559fed8454b12433ff0000a2

## Python
```python
def total(arr):
    t = []
    while len(arr)>1:
        for i in range(len(arr)-1):
            t.append(arr[i]+arr[i+1])
        arr = t.copy()
        if len(t)>1: t = []
    return arr[0]
```

## JavaScript
```js
function total(arr) {
  let t = [];
  while (arr.length>1) {
    for (let i=0;i<arr.length-1;i++) {
      t.push(arr[i]+arr[i+1])
    }
    arr = [...t];
    if (t.length>1) t = [];
  }
  return arr[0]
}
```