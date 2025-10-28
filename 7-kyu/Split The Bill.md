https://www.codewars.com/kata/5641275f07335295f10000d0

## Python
```python
def split_the_bill(x):
    s = 0
    for i in x: s += x[i]
    for i in x: x[i] = round(x[i]-round(s/len(x), 2), 2)
    return x
```

## JavaScript
```js
function splitTheBill(x) {
  let s = 0;
  for (const [key, value] of Object.entries(x)) s += value;
  for (const [key, value] of Object.entries(x)) x[key] = parseFloat((value - (s/Object.keys(x).length)).toFixed(2));
  return x
}
```