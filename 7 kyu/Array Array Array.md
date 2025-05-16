https://www.codewars.com/kata/57eb936de1051801d500008a

## Python
```python
def explode(arr):
    a, b = [arr[0], arr[1]]
    if type(a) == int and type(b) == int: return [arr]*(a+b)
    if type(a) == int: return [arr]*a
    if type(b) == int: return [arr]*b
    return 'Void!'
```

## JavaScript
```js
function createArr(a, b) {
  let t = [];
  for (let i=0;i<b;i++) {
    t.push(a);
  }
  return t
}

function explode(x) {
  if (typeof x[0] == "number" && typeof x[1] == "number") return createArr(x, x[0]+x[1]);
  if (typeof x[0] == "number") return createArr(x, x[0]);
  if (typeof x[1] == "number") return createArr(x, x[1]);
  return 'Void!'
}
```