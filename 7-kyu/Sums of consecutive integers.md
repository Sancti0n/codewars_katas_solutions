https://www.codewars.com/kata/55b54be931e9ce28bc0000d6

## Python
```python
def position(x,y,n):
    n0 = int((y - ((x-1)*x/2))/x)
    l = range(n0, n0+x)
    return l[n]
```

## JavaScript
```js
function position(x, y, n) {
  let n0 = (y - (x-1)*x/2)/x;
  let l =  Array.from({length: Math.ceil(x) }, (_, i) => n0 + i);
  return l[n]
}
```