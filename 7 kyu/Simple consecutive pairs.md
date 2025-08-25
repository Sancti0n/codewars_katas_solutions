https://www.codewars.com/kata/5a3e1319b6486ac96f000049

## Python
```python
def pairs(arr):
    c, i = [0, 0]
    while i<len(arr)-len(arr)%2:
        if abs(arr[i]-arr[i+1]) == 1: c += 1
        i += 2
    return c
```

## JavaScript
```js
function pairs(arr) {
  let c = 0;
  for (let i=0;i<arr.length-arr.length%2;i+=2) {
    if (Math.abs(arr[i]-arr[i+1]) == 1) c++;
  }
  return c
};
```