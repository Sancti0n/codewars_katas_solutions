https://www.codewars.com/kata/584ebd7a044a1520f20000d5

## Python
```python
def range_function(*t):
    t = list(t)
    if len(t) == 1: return range(1, t[0]+1)
    elif len(t) == 2: return range(t[0], t[1]+1)
    return range(t[0], t[2]+1, t[1])
```

## JavaScript
```js
let range = (...a) => {
  let t = [];
  if (a.length == 1) return Array.from({length: a}, (_, i) => i+1)
  if (a.length == 2) return Array.from({length: a[1]-a[0]+1}, (_, i) => i + a[0]);
  else {
    for (let i=a[0];i<=a[2];i=i+a[1]) {
      t.push(i);
    }
  }
  return t
}
```