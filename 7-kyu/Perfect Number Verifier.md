https://www.codewars.com/kata/56a28c30d7eb6acef700004d

## Python
```python
def is_perfect(n):
    if n<6: return False
    t = [2,3,5,7,11,13,17,19,23,29,31]
    i = 0
    while i<=len(t):
        if (2**t[i]-1)*2**(t[i]-1) == n: return True
        if (2**t[i]-1)*2**(t[i]-1) > n: return False
        i += 1
```

## JavaScript
```js
function isPerfect(n) {
  if (n<6) return false
  let t = [2,3,5,7,11,13,17,19,23,29,31];
  let i = 0;
  while (i<t.length) {
    if ((2**t[i]-1)*2**(t[i]-1) == n) return true
    if ((2**t[i]-1)*2**(t[i]-1) > n) return false
    i++;
  }
}
```