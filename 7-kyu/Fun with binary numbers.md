https://www.codewars.com/kata/5ce04eadd103f4001edd8986

## Python
```python
def solution(n,b):
    if b == 0 or 2**n -1<= b: return []
    t = []
    p = format(b, "0"+str(n)+"b").index("1")
    i = 0
    while i<2**n:
        if format(i, '0'+str(n)+'b')[p] == "1": t.append(i)
        i += 1
    return t
```

## JavaScript
```js
function solution(n, b) {
  if (b==0 || 2**n - 1<=b) return []
  let t = [];
  let p = ("0".repeat((2**n -1).toString(2).length - b.toString(2).length) + b.toString(2)).indexOf("1");
  let i = 0;
  while (i<2**n) {
    if (("0".repeat((2**n -1).toString(2).length - i.toString(2).length) + i.toString(2))[p] == "1") {
      t.push(i);
    }
    i++;
  }
  return t
}
```