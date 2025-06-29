https://www.codewars.com/kata/5831c204a31721e2ae000294

## Python
```python
def swap(st):
    s = list(st)
    t = ["a", "e", "i", "o", "u"]
    for i in range(len(s)):
        if s[i] in t: s[i] = s[i].upper()
    return "".join(s)
```

## JavaScript
```js
function swap (string) {
  let s = string.split("");
  let t = ["a", "e", "i", "o", "u"];
  for (let i=0;i<s.length;i++) if (t.indexOf(s[i])>-1) s[i] = s[i].toUpperCase();
  return s.join("")
}
```