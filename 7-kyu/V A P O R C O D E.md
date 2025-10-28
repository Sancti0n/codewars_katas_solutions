https://www.codewars.com/kata/5966eeb31b229e44eb00007a

## Python
```python
def vaporcode(s):
    return "  ".join(s.replace(" ", "").upper())
```

## JavaScript
```js
function vaporcode(string) {
  return string.toUpperCase().replace(/ /g, "").split("").join("  ")
}
```