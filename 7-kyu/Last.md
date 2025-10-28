https://www.codewars.com/kata/541629460b198da04e000bb9

## Python
```python
def last(*arg):
    if len(arg) == 1:
        if type(arg[0]) is int: return arg[0]
        return arg[0][len(arg[0])-1]
    return arg[len(arg)-1]
```

## JavaScript
```js
function last(...list) {
  if (list.length == 1) {
    if (typeof(list[0]) == "number") return list[0]
    return list[0][list[0].length-1]
  }
  return list[list.length-1]
}
```