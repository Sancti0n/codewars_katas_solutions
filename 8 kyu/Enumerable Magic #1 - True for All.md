https://www.codewars.com/kata/54598d1fcbae2ae05200112c

## Python
```python
def _all(seq, fun):
    for i in range(len(seq)):
        if not fun(seq[i]): return False
    return True
```

## JavaScript
```js
function all(seq, fun){
  for (let i=0;i<seq.length;i++) {
    if (!fun(seq[i])) return false
  }
  return true
}
```