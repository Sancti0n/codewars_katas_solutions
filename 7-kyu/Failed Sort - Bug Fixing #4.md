https://www.codewars.com/kata/55c7f90ac8025ebee1000062

## JavaScript
```js
var sortArray = function(value) {
  return value.split('').sort((c, p) => c - p ).join('');
}
```

## Python
```python
def sort_array(value):
    return "".join(sorted(value,key=lambda a: int(a)))
```