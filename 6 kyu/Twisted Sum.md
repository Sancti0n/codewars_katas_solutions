https://www.codewars.com/kata/527e4141bb2ea5ea4f00072f

## Python
```python
def sumN(n):
    return sum([int(i) for i in str(n)])

def compute_sum(n):
    i, s = 1, 0
    while i<=n:
        s += sumN(i)
        i += 1
    return s
```

## JavaScript
```js
function sumN(n) {
  let s = 0;
  for (let i=0;i<n.length;i++) {
    s += parseInt(n[i])
  }
  return s
}

function twistedSum(n) {
  let i = 1, s = 0;
  while (i<=n) {
    s += sumN(i.toString());
    i++;
  }
  return s
}
```