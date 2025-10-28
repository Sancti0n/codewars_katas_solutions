https://www.codewars.com/kata/5a8d1c82373c2e099d0000ac

## Python
```python
def solve(st,a,b):
    return st[:a]+st[a:b+1][::-1]+st[b+1:]
```

## JavaScript
```js
function solve(st,a,b) {
  return st.substring(0,a)+st.substring(a,b+1).split("").reverse().join("")+st.substring(b+1)
}
```