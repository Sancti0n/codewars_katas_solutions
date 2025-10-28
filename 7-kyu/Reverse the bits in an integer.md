https://www.codewars.com/kata/5959ec605595565f5c00002b

## Python
```python
def reverse_bits(n):
    n = format(n, "b")[::-1]
    return int(n,2)
```

## Java
```js
function reverseBits(n) {
  return parseInt(n.toString(2).split("").reverse().join(""), 2)
}
```