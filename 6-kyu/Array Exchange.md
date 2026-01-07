https://www.codewars.com/kata/5353212e5ee40d4694001114

## Python
```python
def exchange_with(a, b):
    la, lb = [len(a), len(b)]
    i, j = [0, 0]
    t = b.copy()
    while i<la:
        if i>=lb: b.insert(0,a[i])
        else: b.insert(0, a[i])
        i += 1
    while j<lb:
        if j>=la: a.insert(0,t[j])
        else: a.insert(0,t[j])
        j += 1
    while len(a)>lb:
        a.pop()
    while len(b)>la:
        b.pop()
```

## JavaScript
```js
function exchangeWith(a, b) {
  let la = a.length, lb = b.length, i = 0, j = 0;
  let t = [...b];
  while (i<la) {
    if (i>=lb) b.unshift(a[i]);
    else b.unshift(a[i]);
    i++;
  }
  while (j<lb) {
    if (j>=la) a.unshift(t[j]);
    else a.unshift(t[j]);
    j++;
  }
  while (a.length>lb) a.pop();
  while (b.length>la) b.pop();
}
```