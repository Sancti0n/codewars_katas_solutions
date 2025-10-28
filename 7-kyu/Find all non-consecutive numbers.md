https://www.codewars.com/kata/58f8b35fda19c0c79400020f

## JavaScript
```js
function allNonConsecutive(arr) {
  let t = [];
  for (let i=1;i<arr.length;i++) {
    if (Math.abs(arr[i]-arr[i-1]) != 1) t.push({"i": i, "n": arr[i]})
  }
  return t
}
```

## Python
```py
def all_non_consecutive(arr):
    t = []
    for i in range(1, len(arr)):
        if abs(arr[i]-arr[i-1]) != 1: t.append({'i': i, 'n': arr[i]})
    return t
```