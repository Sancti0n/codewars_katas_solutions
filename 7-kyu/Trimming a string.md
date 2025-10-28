https://www.codewars.com/kata/563fb342f47611dae800003c

## Python
```python
def trim(phrase, size):
    if len(phrase)>size:
        if size<=3: return phrase[:size] + "..." 
        return phrase[:size-3] + "..."
    if len(phrase) <= size: return phrase
```

## JavaScript
```js
function trim(str, size) {
  if (str.length>size) {
    if (size<=3) return str.substring(0, size) + "..."
    return str.substring(0, size-3) + "..."
  }
  if (str.length <= size) return str
}
```