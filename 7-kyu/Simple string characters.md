https://www.codewars.com/kata/5a29a0898f27f2d9c9000058

## Python
```python
def solve(s):
    t = [0,0,0,0]
    for i in range(len(s)):
        if s[i].isupper(): t[0] += 1
        elif s[i].islower(): t[1] += 1
        elif s[i].isnumeric(): t[2] += 1
        else: t[3] += 1
    return t
```

## JavaScript
```js
function solve(s){
  let t = [0,0,0,0];
  for (let i=0;i<s.length;i++) {
    if (s[i] == s[i].toUpperCase() && s[i] != s[i].toLowerCase()) t[0]++;
    else if (s[i] == s[i].toLowerCase() && s[i] != s[i].toUpperCase()) t[1]++;
    else if (Number.isInteger(Number(s[i]))) t[2]++;
    else t[3]++;
  }
  return t
}
```