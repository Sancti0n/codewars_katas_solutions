https://www.codewars.com/kata/5aa39ba75084d7cf45000008

## Python
```python
def solve(n):
    if n == 0: return "0"
    if n == 1: return "01"
    a, b, s = ["0", "01", ""]
    for i in range(n-1):
        s = b + a
        a = b
        b = s
    return s
```

## JavaScript
```js
function solve(n){
  if (n==0) return "0"
  if (n==1) return "01"
  let a = "0", b = "01", s = "";
  for (let i=0;i<n-1;i++) {
    s = b + a;
    a = b;
    b = s;
  }
  return s
}
```