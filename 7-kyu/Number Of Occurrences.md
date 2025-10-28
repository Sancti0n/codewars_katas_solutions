https://www.codewars.com/kata/52829c5fe08baf7edc00122b

## Python
```python
def number_of_occurrences(elt, arr):
    return arr.count(elt)
```

## JavaScript
```js
Array.prototype.numberOfOccurrences = function(e) {
  return this.filter(elt => elt === e).length
}
```