https://www.codewars.com/kata/54d418bd099d650fa000032d

## Python
```python
def vampire_test(x, y):
    w = ''.join(sorted(str(x)+str(y)))
    m = ''.join(sorted(str(x*y)))
    return w == m
```

## JavaScript
```js
var vampire_test = function(a, b){
  let w = ((a.toString().split("")).concat((b.toString().split("")))).sort().join("")
  let m = ((a*b).toString().split("")).sort().join("")
  return m == w
}
```