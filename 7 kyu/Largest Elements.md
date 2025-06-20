https://www.codewars.com/kata/53d32bea2f2a21f666000256

## Python
```python
def largest(n,xs):
    xs.sort()
    t = []
    i = 1
    while n>0:
        t.insert(0, xs[len(xs)-i])
        n -= 1
        i += 1
    return t
```

## JavaScript
```js
function largest(n, array) {
  array.sort((a,b)=>a-b)
  let i = 1;
  let t = [];
  while (n>0) {
    t.splice(0, 0, array[array.length-i]);
    n--;
    i++;
  }
  return t
}
```