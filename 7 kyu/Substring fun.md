https://www.codewars.com/kata/565b112d09c1adfdd500019c

## Python
```python
def nth_char(words):
    if len(words) == 0: return ''
    else:
        w = ''
        a = 0
        for i in words:
            w += i[a]
            a += 1
        return w
```

## JavaScript
```js
function nthChar(words) {
  if (!words.length) return ""
  let w = "";
  for (let i=0;i<words.length;i++) {
    w += words[i][i]
  }
  return w
}
```