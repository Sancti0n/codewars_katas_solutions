https://www.codewars.com/kata/55b051fac50a3292a9000025

## Python
```python
def filter_string(string):
    v = ""
    for i in string:
        if i.isnumeric(): v += i
    return int(v)
```

## JavaScript
```js
var filterString = function(value) {
  let v = "";
  for (let i=0;i<value.length;i++) {
    if (!isNaN(value[i])) v += value[i];
  }
  return parseInt(v)
}
```