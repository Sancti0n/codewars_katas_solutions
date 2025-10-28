https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5

## Python
```python
def reverse_number(n):
    return -int(str(abs(n))[::-1]) if n<0 else int(str(n)[::-1])
```

## JavaScript
```js
function reverseNumber(n) {
  return n>=0 ? parseInt(n.toString().split("").reverse().join("")) : -parseInt(Math.abs(n).toString().split("").reverse().join(""))
}
```