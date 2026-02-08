https://www.codewars.com/kata/587854330594a6fb7e000057

## JavaScript
```js
function mathEngine(arr) {
  if (arr == null) return 0
  if (arr.length<1) return 1
  let p = 1, n = 0;
  for (let i=0;i<arr.length;i++) {
    if (arr[i]>=0) p *= arr[i];
    else n += arr[i];
  }
  return p+n
}
```

## Python
```py
def math_engine(arr):
    if arr == None: return 0
    p, n = 1, 0
    for i in range(len(arr)):
        if arr[i]>=0:
            p *= arr[i]
        else:
            n += arr[i]
    return p+n
```