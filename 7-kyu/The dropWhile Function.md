https://www.codewars.com/kata/54f9c37106098647f400080a

## Python
```python
def drop_while(arr, pred):
    t = []
    for i in range(len(arr)):
        if not pred(arr[i]): return arr[i:]
    return t
```

## JavaScript
```js
function dropWhile(arr, pred) {
  for (let i=0;i<arr.length;i++) {
    if (!pred(arr[i])) return arr.slice(i)
  }
  return []
}
```