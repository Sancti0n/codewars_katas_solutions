https://www.codewars.com/kata/5a04133e32b8b998dc000089

## Python
```python
def solve(arr):
    t = []
    for i in range(len(arr)):
        if len([arr[j] for j in range(i+1,len(arr)) if arr[i]<=arr[j]]) == 0: t.append(arr[i])
    return t
```

## JavaScript
```js
function solve(arr) {
  let t = [];
  for (let i = 0; i < arr.length; i++) {
    if (arr.slice(i + 1).find((elt) => elt >= arr[i]) == undefined) {
      t.push(arr[i]);
    }
  }
  return t
}
```