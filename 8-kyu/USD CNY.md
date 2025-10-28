https://www.codewars.com/kata/5977618080ef220766000022

## Python
```python
def usdcny(usd):
    x = str(6.75*usd)
    if x[len(x)-2] == '.': x = x + '0'
    return x + " Chinese Yuan"
```

## JavaScript
```js
function usdcny(usd) {
  let x = (6.75*usd).toString();
  if (x[x.length-2] == '.') x = x + '0';
  if (x.indexOf(".") == -1) x = x + ".00";
  return x + " Chinese Yuan"
}
```