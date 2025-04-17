https://www.codewars.com/kata/56b7526481290c2ff1000c75

## JavaScript
```js
function tripleShiftian(base,n){
  for (let i=2;i<n;i++) {
    base.push(4*base[i] - 5*base[i-1] + 3*base[i-2]);
  }
  return base[n];
}
```

## Python
```python
def triple_shiftian(base,n):
    for i in range(2,n):
        base.append(4*base[i] - 5*base[i-1] + 3*base[i-2])
    return base[n]
```