https://www.codewars.com/kata/5a1ebc2480171f29cf0000e5

## Python
```python
import math

def sort_by_area(seq):
    if not seq: return []
    t = [0]*len(seq)
    area = sorted([seq[i][0]*seq[i][1] if type(seq[i]) is tuple else math.pi*seq[i]**2 for i in range(len(seq))])
    for i in range(len(seq)):
        if type(seq[i]) is tuple:
            t[area.index(seq[i][0]*seq[i][1])] = seq[i]
        else:
            t[area.index(math.pi*seq[i]**2)] = seq[i]
    return t
```

## JavaScript
```js
function sortByArea(arr) {
  if (!arr) return []
  let t = Array(arr.length).fill(0);
  let area = [];
  for (let j=0;j<arr.length;j++) {
    if (Array.isArray(arr[j])) area.push(arr[j][0]*arr[j][1]);
    else area.push(Math.PI*arr[j]**2);
  }
  area.sort(function(a, b){return a-b});
  for (let i=0;i<arr.length;i++) {
    if (Array.isArray(arr[i])) t[area.indexOf(arr[i][0]*arr[i][1])] = arr[i];
    else t[area.indexOf(Math.PI*arr[i]**2)] = arr[i];
  }
  return t
}
```