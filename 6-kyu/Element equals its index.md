https://www.codewars.com/kata/5b7176768adeae9bc9000056

## JavaScript
```js
function indexEqualsValue(a) {
  let min = 0, max = a.length - 1, o = -1;
  while (min <= max) {
    let i = Math.floor((min + max)/2);
    if (a[i] == i) o = i;
    if (a[i] < i) min = i + 1;
    else max = i - 1;
  }
  return o
}
```

## Python
```py
import math

def index_equals_value(a):
    min, max, o = [0, len(a)-1, -1]
    while min <= max:
        i = (min + max)//2
        if a[i] == i: o = i
        if a[i] < i: min = i + 1
        else: max = i - 1
    return o
```