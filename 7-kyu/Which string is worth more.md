https://www.codewars.com/kata/5840586b5225616069000001

## JavaScript
```js
function vAscii(n) {
  let s = 0;
  for (let i=0;i<n.length;i++) {
    s += n[i].charCodeAt(0);
  }
  return s
}

function highestValue(a, b) {
  let t = [];
  t[0] = vAscii(a), t[1] = vAscii(b);
  return t[0] >= t[1] ? a : b
}
```

## Python
```py
def vAscii(a):
    return sum([ord(a[i]) for i in range(len(a))])

def highest_value(a, b):
    t = [vAscii(a), vAscii(b)]
    return a if t[0]>=t[1] else b
```