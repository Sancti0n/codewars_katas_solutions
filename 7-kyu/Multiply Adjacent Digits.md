https://www.codewars.com/kata/67191920c29c7e09d9f40707

## JavaScript
```js
function digitMultiplication(e) {
  let s = e[0];
  for (let i=1;i<e.length;i++) {
    if (e[i] == "+" || e[i] == "-") s += e[i];
    else if (e[i-1] == "+" || e[i-1] == "-") s += e[i];
    else s += "*" + e[i];
  }
  return eval(s)
}
```

## Python
```python
def digit_multiplication(e):
    s = e[0]
    for i in range(1,len(e)):
        if e[i] == "+" or e[i] == "-": s += e[i]
        elif e[i-1] == "+" or e[i-1] == "-": s += e[i]
        else: s += "*" + e[i]
    return eval(s)
```