https://www.codewars.com/kata/6469e4c905eaefffd44b6504

## Python
```python
def reverse_number(n, b):
    if b == 1: return n
    t = []
    v = 0;
    while n>0:
        t.append(n%b)
        n = int(n/b)
    for i in range(len(t)):
        v += t[i] * b ** (len(t)-i-1)
    return v
```

## JavaScript
```js
function reverseNumber(n, b){
  n = Number(n);
  b = Number(b);
  if (b==1) return BigInt(n)
  let t = [];
  let v = 0;
  while (n>0) {
    t.push(n%b);
    n = Math.trunc(n / b);
  }
  for (let i=0;i<t.length;i++) {
    v += t[i] * b ** (t.length-i-1);
  }
  return BigInt(v)
}
```