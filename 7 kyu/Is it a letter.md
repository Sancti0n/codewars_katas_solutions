https://www.codewars.com/kata/57a06b07cf1fa58b2b000252

## Python
```python
def is_it_letter(s):
    return True if ord(s)>=65 and ord(s)<=90 or ord(s)>=97 and ord(s)<=122 else False
```

## JavaScript
```js
function isItLetter(c) {
  return c.charCodeAt(0) >= 65 && c.charCodeAt(0) <= 90 || c.charCodeAt(0) >= 97 && c.charCodeAt(0) <= 122
}
```