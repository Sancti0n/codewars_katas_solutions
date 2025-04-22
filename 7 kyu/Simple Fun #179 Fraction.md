https://www.codewars.com/kata/58b8db810f40ea7788000126

## Python
```python
def euclide(a, b):
    while b != 0:
        v = b
        b = a%b
        a = v
    return a

def fraction(a, b):
    m = euclide(a,b)
    return a//m + b//m
```

## JavaScript
```js
function euclide(a,b) {
  let v = 0;
  while (b != 0) {
    v = b;
    b = a%b;
    a = v;
  }
  return a
}

function fraction(a,b) {
  let m = euclide(a,b);
  return parseInt(a/m) + parseInt(b/m)
}
```