https://www.codewars.com/kata/588e27b7d1140d31cb000060

## Python
```py
def generate_pairs(n):
    i, c = [0, 0]
    t = []
    while i<=n:
        while c<=n:
            t.append([i, c])
            c += 1
        i += 1
        c = i
    return t
```

## JavaScript
```js
function generatePairs(n) {
  let i = 0, c = 0, t = [];
  while (i<=n) {
    while (c<=n) {
      t.push([i, c]);
      c++;
    }
    i++;
    c = i;
  }
  return t
}
```