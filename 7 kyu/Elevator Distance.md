https://www.codewars.com/kata/59f061773e532d0c87000d16

## Python
```python
def elevator_distance(arr):
    s = 0
    for i in range(1,len(arr)):
        s += abs(arr[i-1]-arr[i])
    return s
```

## JavaScript
```js
function elevatorDistance(arr) {
  let s = 0;
  for (let i=1;i<arr.length;i++) {
    s += Math.abs(arr[i-1]-arr[i]);
  }
  return s
}
```