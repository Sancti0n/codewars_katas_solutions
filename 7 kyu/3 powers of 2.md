https://www.codewars.com/kata/6545283611df271da7f8418c

## Python
```python
def three_powers(n):
    return False if n<3 else str(format(n, 'b')).count("1")<4
```

## JavaScript
```js
function threePowers(n) {
  return n<3 ? false: (n.toString(2).match(new RegExp("1", "g")) || []).length<4
}
```