https://www.codewars.com/kata/55f8a9c06c018a0d6e000132

## Python
```python
def validate_pin(pin):
    return pin.isnumeric() and(len(pin)==4 or len(pin)==6)
```

## JavaScript
```js
function validatePIN(pin) {
  let reg = /[0-9]/g, t = [4,6];
  if (t.indexOf(pin.length)<0 || pin.match(reg).length != pin.length) return false
  return t.indexOf(pin.match(reg).length)>-1
}
```