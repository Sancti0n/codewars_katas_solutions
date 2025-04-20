https://www.codewars.com/kata/5aca48db188ab3558e0030fa

## Python
```python
def calc_type(a, b, res):
    if a + b == res: return "addition"
    elif a - b == res: return "subtraction"
    elif a * b == res: return "multiplication"
    return "division"
```

## JavaScript
```js
function calcType(a, b, res) {
  if (a + b == res) return "addition"
  if (a - b == res) return "subtraction"
  if (a * b == res) return "multiplication"
  return "division"
}
```