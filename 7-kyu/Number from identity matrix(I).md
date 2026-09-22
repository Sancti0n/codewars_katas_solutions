https://www.codewars.com/kata/66e7c0628a394dd74feb99ca

## JavaScript
```js
function solve(n) {
  let s = 0n, c = 0n;
  n = BigInt(n);
  for (let i=0n;i<n;i++) {
    s += 2n**c;
    c += n + 1n;
  }
  return s;
}
```

## Python
```py
def soln(n):
    s, c = 0, 0
    for i in range(n):
        s += 2**c
        c += n + 1
    return s
```