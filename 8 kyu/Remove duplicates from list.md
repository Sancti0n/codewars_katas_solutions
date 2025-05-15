https://www.codewars.com/kata/57a5b0dfcf1fa526bb000118

## Python
```python
def distinct(seq):
    dict = {}
    for i in range(len(seq)):
        if seq[i] in dict: dict[seq[i]] += 1
        else: dict[seq[i]] = 1
    return list(dict.keys())
```

## JavaScript
```js
function distinct(a) {
  let t = [];
  for (let i=0;i<a.length;i++) {
    if (t.indexOf(a[i]) == -1) t.push(a[i]);
  }
  return t
}
```