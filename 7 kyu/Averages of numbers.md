https://www.codewars.com/kata/57d2807295497e652b000139

## Python
```python
def averages(arr):
    if arr == [] or arr == None: return []
    return [(arr[i]+arr[i+1])/2 for i in range(len(arr)-1)]
```

## JavaScript
```js
function averages(numbers) {
  if (numbers == null) return []
  let t = [];
  for (let i=0;i<numbers.length-1;i++) {
    t.push((numbers[i]+numbers[i+1])/2)
  }
  return t
}
```