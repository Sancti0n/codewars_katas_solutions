https://www.codewars.com/kata/58a6742c14b042a042000038

## Python
```python
def s2n(m, n):
    s, j = [0,0]
    while j<=n:
        for i in range(m+1):
            s += i**j
        j += 1
    return s
```

## JavaScript
```js
function S2N(m, n) {
  let s = 0, j = 0;
  while (j<=n) {
    for (let i=0;i<=m;i++) {
      s += i**j;
    }
    j++;
  }
  return s
}
```