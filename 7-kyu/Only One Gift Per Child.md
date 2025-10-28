https://www.codewars.com/kata/52af0d380fcae83a560008af

## Python
```python
from collections import Counter
counter = Counter()

def hand_out_gift(name):
    if counter[name]: raise Exception("must not throw an error")
    else: counter[name] = 1
```

## JavaScript
```js
var t = {};

function handOutGift(name) {
  if (t[name]) throw new Error("must not throw an error")
  else t[name] = 1
}
```