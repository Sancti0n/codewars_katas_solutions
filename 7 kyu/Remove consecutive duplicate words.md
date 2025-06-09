https://www.codewars.com/kata/5b39e91ee7a2c103300018b3

## Python
```python
def remove_consecutive_duplicates(s):
    t = []
    s = s.split(" ")
    for i in range(len(s)):
        if i == 0: t.append(s[i])
        if s[i] != t[len(t)-1]: t.append(s[i])
    return " ".join(t)
```

## JavaScript
```js
function removeConsecutiveDuplicates(s) {
  let t = [];
  s = s.split(" ");
  for (let i=0;i<s.length;i++) {
    if (i==0) t.push(s[i]);
    if (s[i] != t[t.length-1]) t.push(s[i]);
  }
  return t.join(" ")
}
```