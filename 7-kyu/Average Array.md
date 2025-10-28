https://www.codewars.com/kata/596f6385e7cd727fff0000d6

## Python
```py
def avg_array(arrs):
    t, c = [arrs[0], len(arrs[0])]
    for i in range(1, len(arrs)):
        for j in range(len(arrs[i])):
            t[j] += arrs[i][j]
    return [i/len(arrs) for i in t]
```

## JavaScript
```js
function avgArray(arr) {
  let t = arr[0], c = arr[0].length;
  for (let i=1;i<arr.length;i++) {
    for (let j=0;j<arr[i].length;j++) {
      t[j] += arr[i][j]
    }
  }
  for (let k=0;k<t.length;k++) {
    t[k] /= arr.length;
  }
  return t
}
```