https://www.codewars.com/kata/580a1a4af195dbc9ed00006c

## JavaScript
```js
function equalize(array) {
  if (array.length == 0) return []
  let t = ["+0"];
  let v = 0;
  for (let i=1;i<array.length;i++) {
    v = array[i]-array[0];
    if (v>=0) t.push("+"+v.toString());
    else t.push(v.toString())
  }
  return t
}
```

## Python
```python
def equalize(arr):
    if len(arr) == 0: return []
    t = []
    v = 0
    for i in arr:
        v = i-arr[0]
        if v>=0: t.append("+"+str(v))
        else: t.append(str(v))
    return t
```