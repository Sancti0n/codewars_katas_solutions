https://www.codewars.com/kata/55c606e6babfc5b2c500007c

## JavaScript
```js
var FilterNumbers = function(str) {
  return str.split('').filter(c => !parseInt(c) && c != "0").join('');
}
```

## Python
```python
def filter_numbers(string):
    return "".join(x for x in string if not x.isdigit())
```