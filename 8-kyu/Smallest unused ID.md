https://www.codewars.com/kata/55eea63119278d571d00006a

## Python
```python
def next_id(arr):
    if arr == []: return 0
    arr.sort()
    arr = list(set(arr))
    for i in range(len(arr)):
        if i != arr[i]: return i
    return arr[len(arr)-1]+1
```

## JavaScript
```js
function nextId(arr){
  let i = 0;
  while (arr.indexOf(i)>-1) {
    i++;
  }
  return i
}
```