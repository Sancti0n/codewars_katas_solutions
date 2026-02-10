https://www.codewars.com/kata/56d02e6cc6c8b49c510005bb

## JavaScript
```js
function findMissingNumbers(arr) {
  let a = Math.min(...arr), b = Math.max(...arr);
  let t = [];
  for (let i=a+1;i<b;i++) {
    if (arr.indexOf(i)<0) t.push(i);
  }
  return t
}
```

## Python
```py
def find_missing_numbers(arr):
    if len(arr)<1: return []
    a, b = min(arr), max(arr)
    return [i for i in range(a+1, b) if i not in arr]
```