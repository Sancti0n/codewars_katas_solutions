https://www.codewars.com/kata/57a386117cb1f31890000039

## Python
```python
def parse_float(s):
    try:
        if type(s) is not list: return float(s)
    except ValueError: return None
```

## JavaScript
```js
function parseF(s) {
  if (!isNaN(s) && typeof s != "object" && typeof s != "boolean") return parseFloat(s)
  return null
}
```