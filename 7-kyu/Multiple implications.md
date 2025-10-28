https://www.codewars.com/kata/58f671ee5522a9c33800009b

## Python
```python
def mult_implication(lst):
    if len(lst)<2: return None if len(lst)<1 else lst[0]
    v = lst[0]
    for i in range(len(lst)-1):
        v = not v or lst[i+1]
    return v
```

## JavaScript
```js
function multImplication(arr) {
  if (arr.length<2) return arr.length<1 ? null : arr[0]
  let v = arr[0];
  for (let i=1;i<arr.length;i++) {
    v = !v || arr[i]
  }
  return v
}
```