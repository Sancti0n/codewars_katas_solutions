https://www.codewars.com/kata/5b5604e26dc79e6832000101

## Python
```python
def invert_hash(dictionary):
    d = {}
    for i in dictionary: d[dictionary[i]] = i
    return d
```

## JavaScript
```js
function invertHash(hash) {
  let d = {};
  for (var key in hash) {
    d[hash[key]] = key
  }
  return d
}
```