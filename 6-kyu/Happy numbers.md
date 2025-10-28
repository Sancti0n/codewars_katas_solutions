https://www.codewars.com/kata/5464cbfb1e0c08e9b3000b3e

## Python
```python
def is_happy(n):
    t = []
    n = str(n)
    while n not in t:
        s = 0
        if int(n) == 1: return True
        t.append(n)
        for i in n: s += int(i)**2
        n = str(s)
    return False
```

## JavaScript
```js
function isHappy(n) {
  let t = [];
  n = n.toString();
  while (t.indexOf(n)<0) {
    let s = 0;
    if (parseInt(n) == 1) return true
    t.push(n);
    for (let i=0;i<n.length;i++) s += parseInt(n[i])**2;
    n = s.toString();
  }  
  return false
}
```