https://www.codewars.com/kata/534d2f5b5371ecf8d2000a08

## Python
```python
def multiplication_table(size):
    tab = []
    t = list(range(1, size+1))
    i = 1
    while i<=size:
        tab.append([element*i for element in t])
        i += 1
    return tab
```

## JavaScript
```js
multiplicationTable = function(size) {
  let tab = [];
  let t = [...Array(size+1).keys()].slice(1);
  let i = 1;
  while (i<=size) {
    tab.push(t.map(function(x) { return x * i; }));
    i += 1;
  }
  return tab
}
```