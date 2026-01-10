https://www.codewars.com/kata/59de795c289ef9197f000c48

## JavaScript
```js
function removeBMW(str) {
  if (typeof str != "string") return "This program only works for text."
  let s = str
    .replace(/b/g, "")
    .replace(/B/g, "")
    .replace(/m/g, "")
    .replace(/M/g, "")
    .replace(/w/g, "")
    .replace(/W/g, "");
  return s
}
```

## Python
```py
import re

def remove_bmw(string):
    if type(string) is not str:
        return "This program only works for text."
    return re.sub('[bmwBMW]', '', string)
```