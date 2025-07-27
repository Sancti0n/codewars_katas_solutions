https://www.codewars.com/kata/59c8b38423dacc7d95000008

## Python
```python
def isValid(formula):
    if 1 in formula and 2 in formula: return False
    if 3 in formula and 4 in formula: return False
    if 7 in formula or 8 in formula:
        if 5 in formula or 6 in formula:
            if 5 in formula and 6 in formula: return True
            return False
        return True
    return False
```

## JavaScript
```js
function isValid(formula){
  console.log(formula)
  if ((formula.indexOf(1)>-1 && formula.indexOf(2)>-1) || (formula.indexOf(3)>-1 && formula.indexOf(4)>-1)) return false
  if (formula.indexOf(7)>-1 || formula.indexOf(8)>-1) {
    if (formula.indexOf(5)>-1 || formula.indexOf(6)>-1) {
      if (formula.indexOf(5)>-1 && formula.indexOf(6)>-1) {
        return true
      }
      return false
    }
    return true
  }
  return false
}
```