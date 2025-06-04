https://www.codewars.com/kata/53ad69892a27079b34000bd9

## Python
```python
def Ackermann(m, n):
    if m == 0: return n+1
    if m>0 and n == 0: return Ackermann(m-1, 1)
    if m>0 and n>0: return Ackermann(m-1, Ackermann(m, n-1))
```

## JavaScript
```js
const Ackermann = function(m,n) {
  if (typeof m != 'number' || m<0 || typeof n != 'number' || n<0) return null
  if (m == 0) return n+1
  if (m>0 && n == 0) return Ackermann(m-1, 1)
  if (m>0 && n>0) return Ackermann(m-1, Ackermann(m, n-1))
}
```