https://www.codewars.com/kata/5a092d9e46d843b9db000064

## Python
```python
def solve(arr):
    for i in arr:
        if -i not in arr: return i
```

## JavaScript
```js
function solve(arr){
  for (let i=0;i<arr.length;i++) {
    if (arr.indexOf(-arr[i]) == -1) return arr[i]
  }
};
```