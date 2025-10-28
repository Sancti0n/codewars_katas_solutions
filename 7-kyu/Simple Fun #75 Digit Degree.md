https://www.codewars.com/kata/589422431a88082ea600002a

## Python
```python
def digit_degree(n):
    i = 0
    n = list(map(int, str(n)))
    while len(n)>1:
        i += 1
        n = list(map(int, str(sum(n))))
    return i
```

## JavaScript
```js
function digitDegree(n) {
  let i = 0;
  n = Array.from(String(n), Number);
  while (n.length>1) {
    i++;
    n = Array.from(String(n.reduce((p, c) => p + c, 0)), Number);
  }
  return i
}
```