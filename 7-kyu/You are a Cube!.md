https://www.codewars.com/kata/57da5365a82a1998440000a9

## JavaScript
```js
function youAreACube(value) {
  let i = 1;
  while (i**3<=value) {
    if (i**3 == value) return true
    i++;
  }
  return false
}
```

## Python
```python
def you_are_a_cube(cube):
    i = 1
    while i**3<=cube:
        if i**3 == cube: return True
        i += 1
    return False
```