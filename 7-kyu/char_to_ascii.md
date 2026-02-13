https://www.codewars.com/kata/55e9529cbdc3b29d8c000016

## Python
```py
def char_to_ascii(s):
    if len(s)<1: return None
    d = {}
    for i in s:
        if i not in d and ord(i.lower())>96 and ord(i.lower())<123 :
            d[i] = ord(i)
    return d
```

## JavaScript
```js
function charToAscii(string) {
  if (string.length<1) return null
  let d = {};
  for (let i=0;i<string.length;i++) {
    if (!(string[i] in d) 
        && string[i].toLowerCase().charCodeAt(0)>96 
        && string[i].toLowerCase().charCodeAt(0)<123) {
      d[string[i]] = string[i].charCodeAt(0);
    }
  }
  return d
}
```