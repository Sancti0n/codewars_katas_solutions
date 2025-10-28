https://www.codewars.com/kata/5a32526ae1ce0ec0f10000b2

## Python
```python
from math import *

def digits_average(x):
    st = str(x)
    v = ""
    while len(st)>1:
        for i in range(len(st)-1):
            v += str(ceil( (int(st[i]) + int(st[i+1]) )/2))
        st = v
        v = ""
    return int(st)
```

## JavaScript
```js
function digitsAverage(input) {
  let st = input.toString();
  let v = "";
  while (st.length>1) {
    for (let i=0;i<st.length-1;i++) {
      v += (Math.ceil((+st[i] + +st[i+1])/2)).toString();
    }
    st = v;
    v = "";
  }
  return parseInt(st)
}
```