https://www.codewars.com/kata/5e4217e476126b000170489b

## Python
```python
def polydivisible(x):
    i = 1
    l = len(str(x))
    s = str(x)
    while i<=l:
        if int(s[:i])/i != int(int(s[:i])/i): return False
        i += 1
    return True
```

## JavaScript
```js
function polydivisible(x) {
  let i = 1;
  let l = x.toString().length;
  let s = x.toString();
  while (i<=l) {
    if (parseInt(s.substring(0,i))/i != parseInt(parseInt(s.substring(0,i)/i))) return false
    i++;
  }
  return true
}
```