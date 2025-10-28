https://www.codewars.com/kata/604517d65b464d000d51381f

## JavaScript
```js
function strangeMath(n, k){
  let t = [...Array(n+1).keys()]
  t.sort()
  return t.indexOf(k)
}
```

## Python
```python
def strange_math(n, k):
    t = sorted(range(n+1), key=str)
    return t.index(k)
```