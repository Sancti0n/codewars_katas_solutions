https://www.codewars.com/kata/54592a5052756d5c5d0009c3

## JavaScript
```js
function head(a) {
  return a[0]
}

function tail(a) {
  return a.slice(1)
}

function init(a) {
  return a.slice(0, a.length-1)
}

function last(a) {
  return a[a.length-1] 
}
```

## Python
```python
def head(a): return a[0]

def tail(a): return a[1:]

def init(a): return a[:len(a)-1]

def last(a): return a[-1]
```