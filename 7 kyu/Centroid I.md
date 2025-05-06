https://www.codewars.com/kata/58811e9cfd05cb5aed0000a4

## Python
```python
def centroid(c):
    t, s = [], 0
    for i in range(3):
        for j in range(len(c)):
            s += c[j][i]
        t.append(round(s/len(c), 2))
        s = 0
    return t
```

## JavaScript
```js
function centroid(c) {
  let t = [];
  let s = 0;
  for (let i=0;i<3;i++) {
    for (let j=0;j<c.length;j++) {
      s += c[j][i];
    }
    t.push(parseFloat((s/c.length).toFixed(2)))
    s = 0;
  }
  return t
}
```