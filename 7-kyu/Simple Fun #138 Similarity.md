https://www.codewars.com/kata/58a6841442fd72aeb4000080

## Python
```python
def similarity(a, b):
    n = 0
    for i in a:
        if i in b: n += 1
        else: b.append(i)
    return n/len(b)
```

## JavaScript
```js
function similarity(a, b) {
  let n = 0;
  for (let i=0;i<a.length;i++) {
    if (b.indexOf(a[i])>-1) n++;
    else b.push(a[i]);
  }
  return n/b.length
}
```