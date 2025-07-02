https://www.codewars.com/kata/545cedaa9943f7fe7b000048

## Python
```python
def is_pangram(s):
    a = list(dict.fromkeys(sorted(s.lower())))
    i = 0
    while a[i] != 'a':
        a.remove(a[i])
    if len(a) == 26: return True
    else: return False
```

## JavaScript
```js
function isPangram(s) {
  let t = [...new Set(s.toLowerCase())].sort();
  let i = 0;
  while (t[i] != "a") t.shift();
  return t.length == 26
}
```