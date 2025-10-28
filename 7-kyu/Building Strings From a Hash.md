https://www.codewars.com/kata/51c7d8268a35b6b8b40002f2

## JavaScript
```js
function solution(pairs) {
  let w = "";
  for (const p in pairs) {
    w += p + " = " + pairs[p] + ","
  }
  return w.substring(0,w.length-1)
}
```

## Python
```python
def solution(pairs):
    w = ""
    for i in pairs:
        w += str(i) + " = " + str(pairs[i]) + ","
    return w[:-1]
```