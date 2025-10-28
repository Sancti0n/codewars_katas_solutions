https://www.codewars.com/kata/588e0f11b7b4a5b373000041

## Python
```python
def lowest_temp(t):
    if len(t) == 0: return None
    arr = [int(i) for i in t.split(" ")]
    return sorted(arr)[0]
```

## JavaScript
```js
function lowestTemp(t) {
  if (!t) return null
  t = t.split(" ")
  for (let i=0;i<t.length;i++) {
    t[i] = parseInt(t[i]);
  }
  t.sort((a,b)=>a-b);
  return t[0]
}
```