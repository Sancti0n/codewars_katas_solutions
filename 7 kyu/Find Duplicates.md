https://www.codewars.com/kata/5558cc216a7a231ac9000022

## JavaScript
```js
function duplicates(arr) {
  let d = {};
  let s = {};
  let t = [];
  for (let i=0;i<arr.length;i++) {
    if (typeof arr[i] == "string") {
      if (s.hasOwnProperty(arr[i])) {
        if (s[arr[i]] == 1) t.push(arr[i]);
        s[arr[i]]++;
      }
      else s[arr[i]] = 1;
    }
    else {
      if (d.hasOwnProperty(arr[i])) {
        if (d[arr[i]] == 1) t.push(arr[i]);
        d[arr[i]]++;
      }
      else d[arr[i]] = 1;
    }
  }
  return t
}
```

## Python
```python
def duplicates(arr):
    d = {}
    t = []
    for i in arr:
        if i in d:
            if d[i] == 1: t.append(i)
            d[i] += 1
        else: d[i] = 1
    return t
```