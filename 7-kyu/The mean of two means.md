https://www.codewars.com/kata/583df40bf30065fa9900010c

## JavaScript
```js
function getMean(arr, x, y) {
  if (x<=1 || y<=1 || arr.length<x || arr.length<y) return -1
  let t1 = arr.slice(0,x)
  let s = t1.reduce((p, c) => p + c, 0)/t1.length
  let t2 = arr.reverse().slice(0, y)
  s += t2.reduce((p, c) => p + c, 0)/t2.length
  return s/2 > 1 ? s/2 : -1
}
```

## Python
```python
def get_mean(arr,x,y):
    if x<=1 or y<=1 or len(arr)<x or len(arr)<y: return -1
    t1 = arr[0:x]
    t2 = arr[len(arr)-y:]
    s = sum(t1)/len(t1) + sum(t2)/len(t2)
    return s/2
```