https://www.codewars.com/kata/563319974612f4fa3f0000e0

## JavaScript
```js
function mineColor(file, rank) {
  let s = "abcdefgh";
  return (s.indexOf(file)+1)%2 == rank%2 ? "black" : "white"
}
```

## Python
```python
def square_color(file, rank):
    s = "abcdefgh"
    return "black" if (s.index(file)+1)%2 == rank%2 else "white"
```