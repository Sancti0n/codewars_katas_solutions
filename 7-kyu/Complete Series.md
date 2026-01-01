https://www.codewars.com/kata/580a4001d6df740d61000301

## Python
```py
def complete_series(seq):
    for i in seq:
        if seq.count(i)>1: return [0]
    return list(range(max(seq)+1))
```

## JavaScript
```js
function completeSeries(arr) {
  arr.sort((a,b)=>a-b);
  for (let i=1;i<arr.length;i++) {
    if (arr[i-1] == arr[i]) return [0]
  }
  return [...Array(arr[arr.length-1]+1).keys()] 
}
```