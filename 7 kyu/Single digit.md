https://www.codewars.com/kata/5a7778790136a132a00000c1

## Python
```python
def single_digit(n):
    if n<10: return n
    if format(n, "b").count("1")>9:
        while format(n, "b").count("1")>9:
            n = format(n, "b").count("1")
        return format(n, "b").count("1")
    return format(n, "b").count("1")
```

## JavaScript
```js
function singleDigit(n) {
  while (n>9) {
    n = (n.toString(2).match(new RegExp("1", "g")) || []).length
  }
  return n
}
```