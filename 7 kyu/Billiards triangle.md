https://www.codewars.com/kata/5bb3e299484fcd5dbb002912

## Python
```python
def pyramid(balls):
    c, s = 0, 0
    while s<=balls:
        s += c
        c += 1
    return c-2
```

## JavaScript
```js
function pyramid(n) {
  let i = 1;
  while (i<=n) {
    n -= i;
    i++;
  }
  return i-1
}
```