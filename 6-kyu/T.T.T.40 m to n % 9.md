https://www.codewars.com/kata/57b2cef5d2a31c3965000a43

## Python
```py
def n_mod9(m, n):
    return sum(list(range(m, n+1)))%9
```

## JavaScript
```js
function nMod9(m,n) {
  let s = 0;
  for (let i=m;i<=n;i++) {
    s += i;
  }
  return s%9
}
```