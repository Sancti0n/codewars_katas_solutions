https://www.codewars.com/kata/5b5e0c0d83d64866bc00001d

## Python
```python
from math import *

def say_me_operations(string_numbers):
    t = string_numbers.split(" ")
    op = ["addition, ","subtraction, ","multiplication, ","division, "]
    v = [0]*4
    s = ""
    for i in range(len(t)-2):
        if int(t[i]) + int(t[i+1]) == int(t[i+2]): v[0] = 1
        elif int(t[i]) - int(t[i+1]) == int(t[i+2]): v[1] = 1
        elif int(t[i]) * int(t[i+1]) == int(t[i+2]): v[2] = 1
        elif int(int(t[i]) / int(t[i+1])) == int(t[i+2]) or floor(int(t[i]) / int(t[i+1])) == int(t[i+2]): v[3] = 1
        if sum(v) == 0: s += op[0]
        else: s += op[v.index(1)]
        v = [0]*4
    return s[:-2]
```

## JavaScript
```js
function sayMeOperations(str) {
  let t = str.split(" ").map(Number);
  let op = ["addition, ","subtraction, ","multiplication, ","division, "];
  let v = [0,0,0,0];
  let s = "";
  for (let i=0;i<t.length-2;i++) {
    if (t[i]+t[i+1] == t[i+2]) v[0] = 1;
    else if (t[i]-t[i+1] == t[i+2]) v[1] = 1;
    else if (t[i]*t[i+1] == t[i+2]) v[2] = 1;
    else if (t[i]/t[i+1] == t[i+2] || Math.floor(t[i]/t[i+1]) == t[i+2] || Math.ceil(t[i]/t[i+1]) == t[i+2]) v[3] = 1;
    if (v.indexOf(1)<0) s += op[0];
    else s += op[v.indexOf(1)];
    v = [0,0,0,0];
  }
  return s.substring(0,s.length-2)
}
```