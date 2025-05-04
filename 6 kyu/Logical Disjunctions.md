https://www.codewars.com/kata/55b019265ff4eeef8c000039

## Python
```python
def disjunction(operands, is_exclusive):
    if not is_exclusive: return True in operands
    v = operands[0]
    for i in range(1, len(operands)):
        if v == operands[i]: v = False
        else: v = True
    return v
```

## JavaScript
```js
function disjunction(operands, isExclusive) {
  if (!isExclusive) return operands.indexOf(true)>-1
  let v = operands[0];
  for (let i=1;i<operands.length;i++) {
    if (v == operands[i]) v = false;
    else v = true;
  }
  return v
}
```