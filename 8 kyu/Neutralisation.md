https://www.codewars.com/kata/65128732b5aff40032a3d8f0

## Python
```python
def neutralise(s1, s2):
    s = ""
    for i in range(len(s1)):
        if s1[i] == s2[i]: s += s1[i]
        else: s += "0"
    return s
```

## JavaScript
```js
function neutralise(s1, s2) {
  let s = "";
  for (let i=0;i<s1.length;i++) {
    if (s1[i] == s2[i]) s += s1[i];
    else s += "0";
  }
  return s
}
```