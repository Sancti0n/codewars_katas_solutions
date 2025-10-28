https://www.codewars.com/kata/56368f37d464c0a43c00007f

## Python
```python
def calculate(a, o, b):
    if(o == "+"): return a + b
    if(o == "-"): return a - b
    if(o == "/" and b != 0): return a / b
    if(o == "*"): return a * b
    return None
```

## JavaScript
```js
function calculate(a, o, b) {
  switch (o) {
      case "+": return a+b
      case "-": return a-b
      case "/": return b != 0 ? a/b : null
      case "*": return a*b
      default: return null
  }
}
```