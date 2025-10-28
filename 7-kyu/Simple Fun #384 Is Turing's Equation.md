https://www.codewars.com/kata/5a1e6323ffe75f71ae000026

## Python
```python
def is_turing_equation(s):
    t = [s.split("+")[0]] + s.split("+")[1].split("=")
    return int(t[0][::-1]) + int(t[1][::-1]) == int(t[2][::-1])
```

## JavaScript
```js
function isTuringEquation(s) {
  let t = parseInt(s.split("+")[0].split("").reverse().join("")) + parseInt(s.split("+")[1].split("=")[0].split("").reverse().join(""));
  return t == parseInt(s.split("=")[1].split("").reverse().join(""))
}
```