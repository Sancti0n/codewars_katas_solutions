https://www.codewars.com/kata/57fb142297e0860073000064

## Python
```python
def product(st):
    return st.count("!")*st.count("?")
```

## JavaScript
```js
function count(s, a) {
  return (s.match(new RegExp(a, "g")) || []).length
}

function product(st) {
  return count(st, /[?]/)*count(st, /[!]/)
}
```