https://www.codewars.com/kata/586566b773bd9cbe2b000013

## JavaScript
```js
function countInString(s, a) {
  return (s.match(new RegExp(a, "g")) || []).length
}

function noRepeat(str) {
  for (let i=0;i<str.length;i++) {
    if (countInString(str, str[i])<2) return str[i]
  }
}
```

## Python
```py
def no_repeat(string):
    for i in string:
        if string.count(i)<2:
            return i
```