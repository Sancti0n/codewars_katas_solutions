https://www.codewars.com/kata/544a54fd18b8e06d240005c0

## Python
```python
def find_smallest(numbers,t):
    if t == "index": return numbers.index(min(numbers))
    return min(numbers)
```

## JavaScript
```js
function min(arr, t) {
  if (t == "index") return arr.indexOf(Math.min(...arr))
  return Math.min(...arr)
}
```