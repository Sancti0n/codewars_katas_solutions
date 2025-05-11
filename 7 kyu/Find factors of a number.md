https://www.codewars.com/kata/564fa92d1639fbefae00009d

## Python
```python
def factors(x):
    if type(x) is not int or x<=0 or x%1 != 0: return -1
    t = []
    i = x
    while i>0:
        if x%i == 0: t.append(i)
        i -= 1
    return t
```

## JavaScript
```js
function factors(x){
  if (typeof x != "number" || x<=0 || x%1 != 0) return -1
  let t = [];
  let i = x;
  while (i>0) {
    if (x%i == 0) t.push(i);
    i--;
  }
  return t
}
```