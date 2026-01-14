https://www.codewars.com/kata/52cd0d600707d0abcd0003eb

## JavaScript
```js
function sumArr(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function minimumSum(values, n) {
  if (n == 0 || values.length == 0) return 0
  values.sort((a,b)=>a-b);
  let s = 0;
  if (n>values.length) n = values.length;
  for (let i=0;i<n;i++) {
    s += values[i];
  }
  return s
}

function maximumSum(values, n) {
  if (n == 0 || values.length == 0) return 0
  values.sort((a,b)=>b-a);
  let s = 0;
  if (n>values.length) n = values.length;
  for (let i=0;i<n;i++) {
    s += values[i];
  }
  return s
}
```

## Python
```py
def add(arr, n):
    if n == 0 or len(arr) == 0: return 0
    if n>len(arr): n = len(arr)
    return sum(arr[:n])

def minimum_sum(values, n):
    values.sort(reverse=False)
    return add(values, n)
    

def maximum_sum(values, n):
    values.sort(reverse=True)
    return add(values, n)
```