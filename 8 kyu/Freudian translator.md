https://www.codewars.com/kata/5713bc89c82eff33c60009f7

## JavaScript
```js
function toFreud(string) {
  let s = string.split(" ");
  if (string === '') return ''
  s = 'sex '.repeat(s.length);
  return s.substring(0, s.length-1)
}
```

## Python
```python
def to_freud(sentence):
    s = sentence.split(" ")
    if sentence == '': return ''
    return ('sex '*len(s))[:-1]
```