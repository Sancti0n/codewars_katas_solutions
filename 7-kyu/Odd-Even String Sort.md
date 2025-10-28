https://www.codewars.com/kata/580755730b5a77650500010c

## Python
```python
def sort_my_string(s):
    a, b = ["", ""]
    for i in range(len(s)):
        if i%2: b += s[i]
        else: a += s[i]
    return a + " " + b
```

## JavaScript
```js
function sortMyString(s) {
  let a = "", b = "";
  for (let i=0;i<s.length;i++) {
    if (i%2) b += s[i];
    else a += s[i];
  }
  return a + " " + b
}
```