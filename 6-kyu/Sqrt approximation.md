https://www.codewars.com/kata/52ecde1244751a799b00018a

## Python
```python
def sq(n):
    i = 0
    while n>0:
        n = n - (2*i + 1)
        i += 1
    return i

def sqrt_approximation(n):
    if sq(n)*sq(n) == n: return sq(n)
    return [sq(n)-1, sq(n)]
```

## JavaScript
```js
function sq(n) {
  let i = 0;
  while (n>0) {
    n = n - (2*i + 1);
    i++;
  }
  return i
}
    
function sqrtApproximation(n) {
    if (sq(n)*sq(n) == n) return sq(n)
    return [sq(n)-1, sq(n)]
}
```