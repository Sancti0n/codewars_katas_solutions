https://www.codewars.com/kata/55d5434f269c0c3f1b000058

## Python
```python
def triple_double(num1, num2):
    for i in range(10):
        if str(i)*3 in str(num1) and str(i)*2 in str(num2): return 1
    return 0
```

## JavaScript
```js
function tripledouble(num1, num2) {
  for (let i=0;i<10;i++) {
    if (num1.toString().indexOf(i.toString().repeat(3)) > -1 && num2.toString().indexOf(i.toString().repeat(2)) > -1) {
      return 1
    }
  }
  return 0
}
```