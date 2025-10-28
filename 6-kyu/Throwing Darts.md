https://www.codewars.com/kata/525dfedb5b62f6954d000006

## JavaScript
```js
function scoreThrows(radii) {
  if (radii.length == 0) return 0
  if (radii.filter((e) => e<5).length == radii.length) return 10*radii.length + 100
  let s = 0;
  for (let i=0;i<radii.length;i++) {
    if (radii[i]>=5 && radii[i]<=10) s += 5;
    if (radii[i]<5) s += 10;
  }
  return s
}
```

## Python
```python
def score_throws(radii):
    if len(radii) == 0: return 0
    if len([i for i in radii if i<5]) == len(radii): return 10*len(radii) + 100
    s = 0
    for i in radii:
        if i>=5 and i<=10: s+= 5
        if i<5: s += 10
    return s
```