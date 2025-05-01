https://www.codewars.com/kata/5727868888095bdf5c001d3d

## Python
```python
def string_to_int_list(s):
    return [int(i) for i in s.split(',') if i != '']
```

## JavaScript
```js
function stringToIntArray(s) {
  let t = s.split(",");
  let tab = [];
  for (let i=0;i<t.length;i++) {
    if (t[i] != "") tab.push(parseInt(t[i]))
  }
  return tab
}
```