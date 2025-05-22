https://www.codewars.com/kata/5784c89be5553370e000061b

## Python
```python
def max_product(a):
    m = max(a)
    a.remove(m)
    return m*max(a)
```

## JavaScript
```js
function maxProduct(a) {
  let m = Math.max(...a);
  let i = a.indexOf(m);
  a.splice(i, 1);
  return m*Math.max(...a)
}
```