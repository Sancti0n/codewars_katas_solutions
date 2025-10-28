https://www.codewars.com/kata/59b8614a5227dd64dc000008

## Python
```python
def min_distance(n):
    t = [1]
    i, m = [2,n]
    while i<=n:
        if not n%i:
            t.append(i)
            if m>t[len(t)-1]-t[len(t)-2]: m = t[len(t)-1]-t[len(t)-2]
        i += 1
    return m
```

## JavaScript
```js
function minDistance(n) {
  let t = [1];
  let i = 2, m = n;
  while (i<=n) {
    if (n%i<1) {
      t.push(i);
      if (m>t[t.length-1]-t[t.length-2]) m = t[t.length-1]-t[t.length-2];
    }
    i++;
  }
  return m
}
```