https://www.codewars.com/kata/559760bae64c31556c00006b

## JavaScript
```js
function climb(n) {
  let t = [n], i = n;
  while (i>1) {
    i = parseInt(i/2);
    t.unshift(i);
  }
  return t
}
```

## Python
```py
def climb(n):
    t = [n]
    while n>1:
        n = n//2
        t.insert(0, n)
    return t
```