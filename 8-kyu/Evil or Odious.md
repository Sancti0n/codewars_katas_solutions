https://www.codewars.com/kata/56fcfad9c7e1fa2472000034

## Python
```python
def evil(n):
    return "It's Odious!" if format(n, "b").count("1")%2 == 1 else "It's Evil!"
```

## JavaScript
```js
function count(s) {
  return (s.match(new RegExp("1", "g")) || []).length
}

function evil(n) {
    return count(n.toString(2))%2 ? "It's Odious!": "It's Evil!"
}
```