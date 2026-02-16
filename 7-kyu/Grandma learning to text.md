https://www.codewars.com/kata/5a043fbef3251a5a2b0002b0

## JavaScript
```js
function textin(s) {
  let r1 = /two/gi, r2 = /too/gi, r3 = /to/gi;
  s = s.replaceAll(r1, 2).replaceAll(r2, 2).replaceAll(r3, 2);
  return s
}
```

## Python
```py
import re

def textin(s):
    return re.sub("two|too|to", "2", s, flags=re.IGNORECASE)
```