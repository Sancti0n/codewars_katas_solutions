https://www.codewars.com/kata/56b1eb19247c01493a000065

## Python
```python
def unique_sum(lst):
    if len(lst) == 0: return None
    return sum(list(set(lst)))
```

## JavaScript
```js
function uniqueSum(lst){
  if (lst.length == 0) return null
  return [...new Set(lst)].reduce((p, c) => p + c, 0)
}
```