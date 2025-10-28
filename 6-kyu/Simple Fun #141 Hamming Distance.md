https://www.codewars.com/kata/58a6af7e8c08b1e9c40001c1

## Python
```python
def hamming_distance(a, b):
    b1 = format(a, "b")
    b2 = format(b, "b")
    m1 = max(len(b1), len(b2))
    m2 = min(len(b1), len(b2))
    if m1 != m2:
        if len(b1) == m1: b2 = "0"*(m1-m2)+b2
        else: b1 = "0"*(m1-m2)+b1
    d = 0
    for i in range(len(b1)):
        if b1[i] != b2[i]: d += 1
    return d
```

## JavaScript
```js
function hammingDistance (a, b) {
  return ((a^b).toString(2).match(new RegExp("1", "g")) || []).length
}
```