https://www.codewars.com/kata/58844f1a76933b1cd0000023

## Python
```python
def kill_kth_bit(n, k):
    if n == 0: return n
    v = list(format(n, "b"))
    if len(v)<k: return n
    if v[len(v)-k] == 0: return n
    v[len(v)-k] = '0'
    return int("".join(v), 2)
```

## JavaScript
```js
function killKthBit(n, k) {
  if (n == 0) return n
  v = n.toString(2).split("");
  if (v.length<k) return n
  if (v[v.length-k] == 0) return n
  v[v.length-k] = '0';
  return parseInt(v.join(""), 2)
}
```