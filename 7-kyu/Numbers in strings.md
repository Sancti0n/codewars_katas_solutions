https://www.codewars.com/kata/59dd2c38f703c4ae5e000014

## Python
```python
def solve(s:str) -> int:
    w = ""
    t = []
    a = 0
    while a<len(s):
        while a<len(s) and s[a].isdigit():
            w += s[a]
            a += 1
        if w != "":
            t.append(int(w))
            w = ""
        a += 1
    return max(t)
```

## JavaScript
```js
function solve(s) {
  let m = 0, v = "";
  for (let i=0;i<s.length;i++) {
    if (!isNaN(s[i])) v += s[i];
    else {
      if (parseInt(v)>m) m = parseInt(v);
      v = "";
    }
  }
  return parseInt(v)>m ? parseInt(v): m
};
```