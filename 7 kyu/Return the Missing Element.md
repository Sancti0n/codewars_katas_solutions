https://www.codewars.com/kata/5299413901337c637e000004

## Python
```python
def get_missing_element(seq):
    return len(seq)*(len(seq)+1)/2 - sum(seq)
```

## JavaScript
```js
function getMissingElement(arr) {
  return arr.length*(arr.length+1)/2 - arr.reduce((a, b) => a + b, 0)
}
```