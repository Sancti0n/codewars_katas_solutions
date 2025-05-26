https://www.codewars.com/kata/5356ad2cbb858025d800111d

## JavaScript
```js
function capMe(names) {
  return names.map((x) => x[0].toUpperCase() + x.substring(1).toLowerCase());
}
```

## Python
```python
def cap_me(arr):
    return [i[:1].upper()+i[1:].lower() for i in arr]
```