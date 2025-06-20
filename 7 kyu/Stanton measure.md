https://www.codewars.com/kata/59a1cdde9f922b83ee00003b

## JavaScript
```js
function stantonMeasure(arr) {
  return arr.filter(elt => elt === arr.filter(elt => elt === 1).length).length
}
```

## Python
```python
def stanton_measure(arr):
    return arr.count((arr.count(1)))
```