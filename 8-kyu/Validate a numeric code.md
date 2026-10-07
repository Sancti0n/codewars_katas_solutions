https://www.codewars.com/kata/56a25ba95df27b7743000016

## Python
```py
def validate_code(code):
    return str(code)[0] in "123"
```

## JavaScript
```js
function validateCode(code) {
  return "123".indexOf(code.toString()[0]) > -1
}
```