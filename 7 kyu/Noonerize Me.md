https://www.codewars.com/kata/56dbed3a13c2f61ae3000bcd

## Python
```python
def noonerize(arr):
    if type(arr[0]) is not int or type(arr[1]) is not int: return "invalid array"
    return abs(int(str(arr[1])[0]+str(arr[0])[1:]) - int(str(arr[0])[0]+str(arr[1])[1:]))
```

## JavaScript
```js
function noonerize(arr) {
  if (typeof arr[0] != "number" || typeof arr[1] != "number") return "invalid array"
  return Math.abs(parseInt(arr[1].toString()[0]+arr[0].toString().substring(1)) - parseInt(arr[0].toString()[0]+arr[1].toString().substring(1)))
}
```