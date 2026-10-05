https://www.codewars.com/kata/5697fb83f41965761f000052

## JavaScript
```js
function filterLongWords(sentence, n) {
  let t = []
  let s = sentence.split(' ')
  for (let i=0;i<s.length;i++) {
    if (s[i].length>n) t.push(s[i])
  }
  return t
}
```

## Python
```py
def filter_long_words(sentence, n):
    return [word for word in sentence.split() if len(word) > n]
```