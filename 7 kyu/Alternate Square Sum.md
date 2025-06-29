https://www.codewars.com/kata/559d7951ce5e0da654000073

## Python
```python
def alternate_sq_sum(arr):
    return sum([arr[i]**2 if i%2 == 1 else arr[i] for i in range(len(arr))])
```

## JavaScript
```js
function alternateSqSum(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) {
    if (i%2) s += arr[i]**2;
    else s += arr[i];
  }
  return s
}
```