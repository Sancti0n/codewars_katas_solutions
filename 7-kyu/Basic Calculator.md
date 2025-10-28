https://www.codewars.com/kata/5296455e4fe0cdf2e000059f

## Python
```python
def calculate(num1, operation, num2):
    if operation == "/" and num2 == 0 or operation not in ["+", "-", "*", "/"]: return None
    return eval(str(num1) + operation + str(num2))
```

## JavaScript
```js
function calculate(num1, operation, num2) {
  if (operation == "/" && num2 == 0 || ["+", "-", "*", "/"].indexOf(operation)==-1) return null
  return eval(num1.toString()+operation+num2.toString())
}
```