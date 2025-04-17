https://www.codewars.com/kata/55c3026406402936bc000026

## Python
```python
def insert_dash2(num):
    s = ""
    t = list(map(int, str(num)))
    for i in range(len(t)-1):
        if t[i] != 0 and t[i+1] != 0 and t[i]%2 == 0 and t[i+1]%2 == 0: s += str(t[i]) + "*"
        elif t[i]%2 == 1 and t[i+1]%2 == 1: s += str(t[i]) + "-"
        else: s += str(t[i])
    return s+str(t[len(t)-1])
```

## JavaScript
```js
function insertDashII(num) {
  let s = "";
  let t = Array.from(String(num), Number);
  for (let i=0;i<t.length-1;i++) {
    if (t[i] != 0 && t[i+1] != 0 && t[i]%2 == 0 && t[i+1]%2 == 0) {
      s += t[i].toString() + "*";
    }
    else if (t[i]%2 == 1 && t[i+1]%2 == 1) {
      s += t[i].toString() + "-";
    }
    else {
      s += t[i].toString();
    }
  }
  return s + t[t.length-1].toString()
}
```