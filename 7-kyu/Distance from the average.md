https://www.codewars.com/kata/568ff914fc7a40a18500005c

## Python
```python
def distances_from_average(l):
    l = list(l)
    v = sum(l)/len(l)
    for i in range(len(l)):
        l[i] = round(v-l[i], 2)
    return l
```

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function distancesFromAverage(arr) {
  let v = sum(arr)/arr.length;
  for (let i=0;i<arr.length;i++) {
    arr[i] = Math.round((v-arr[i])*100)/100;
  }
  return arr
}
```