https://www.codewars.com/kata/54d3bb4dfc75996c1c000c6d

## Python
```py
def midpoint_sum(arr):
    if len(arr)<3: return -1
    for i in range(1, len(arr)-1):
        if sum(arr[:i]) == sum(arr[i+1:]): return i
    return -1
```

## JavaScript
```js
function sumArr(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

var midpointSum=function(arr) {
  if (arr.length<3) return undefined
  for (let i=1;i<arr.length-1;i++) {
    if (sumArr(arr.slice(0,i)) == sumArr(arr.slice(i+1))) return i
  }
  return undefined
};
```