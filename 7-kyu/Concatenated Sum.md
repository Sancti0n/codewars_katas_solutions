https://www.codewars.com/kata/59a1ec603203e862bb00004f

## JavaScript
```js
function checkConcatenatedSum(n, r) {
  let s = 0;
  let str = Math.abs(n).toString();
  for (let i=0;i<str.length;i++) {
    s += parseInt(str[i].repeat(r))
  }
  return Math.abs(n) == s
}
```

## Python
```python
def check_concatenated_sum(n,r):
    if r == 0: return False
    sum = 0
    s = str(abs(n))
    for i in s:
        sum += int(i*r)
    return abs(n) == sum
```