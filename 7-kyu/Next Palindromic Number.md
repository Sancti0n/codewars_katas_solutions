https://www.codewars.com/kata/56a6ce697c05fb4667000029

## JavaScript
```js
function nextPal(val) {
  val++;
  while (val != parseInt(val.toString().split("").reverse().join(""))) val++;
  return val
}
```

## Python
```python
def next_pal(val):
    val += 1
    while val != int(str(val)[::-1]): val += 1
    return val
```