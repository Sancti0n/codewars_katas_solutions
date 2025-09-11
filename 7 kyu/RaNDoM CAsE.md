https://www.codewars.com/kata/57073869924f34185100036d

## JavaScript
```js
function randomCase(x) {
  let s = "";
  for (let i=0;i<x.length;i++) {
    s += Math.random()<0.5 ? x[i].toUpperCase(): x[i].toLowerCase();
  }
  return s
}
```

## Python
```py
import random

def random_case(x):
    s = ""
    for i in x:
        s += i.upper() if random.randint(0, 10)<5 else i.lower()
    return s
```