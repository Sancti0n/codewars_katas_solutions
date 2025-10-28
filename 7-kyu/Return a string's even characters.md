https://www.codewars.com/kata/566044325f8fddc1c000002c

## JavaScript
```js
function evenChars(string) {
  if (string.length<2 || string.length>100) return "invalid string"
  let t = [];
  for (let i=0;i<string.length;i++) {
    if (i%2 == 1) t.push(string[i]);
  }
  return t
}
```

## Python
```python
def even_chars(st):
    if len(st)<2 or len(st)>100: return "invalid string"
    return [st[i] for i in range(len(st)) if i%2 == 1]
```