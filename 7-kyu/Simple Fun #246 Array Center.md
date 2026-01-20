https://www.codewars.com/kata/590bdaa251ab8267b800005b

## JavaScript
```js
function arrayCenter(a) {
  let m = Math.min(...a), avg = (a.reduce((p, c) => p + c, 0))/a.length, t = [];
  for (let i=0;i<a.length;i++) {
    if (Math.abs(a[i]-avg) < m) t.push(a[i])
  }
  return t
}
```

## Python
```py
def array_center(arr):
    m, avg, t = [min(arr), sum(arr)/len(arr), []]
    for i in arr:
        if (abs(i-avg) < m):
            t.append(i)
    return t
```