https://www.codewars.com/kata/58f625e20290fb29c3000056

## Python
```python
def alt_or(lst):
    return None if len(lst) == 0 else True in lst
```

## JavaScript
```js
function alternate(items) {
  return items.length == 0 ? null: items.indexOf(true)>-1
}
```