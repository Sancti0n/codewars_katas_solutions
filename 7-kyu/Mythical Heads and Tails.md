https://www.codewars.com/kata/5751aa92f2dac7695d000fb0

## JavaScript
```js
function beasts(heads, tails){
  let y = (heads-2*tails)/3;
  let x = tails-y;
  return x>=0 && parseInt(x) == x && y>=0 && parseInt(y) == y ? [x,y]:'No solutions'
}
```

## Python
```python
def beasts(heads, tails):
    y = (heads-2*tails)/3
    x = tails-y
    return [x,y] if x>=0 and int(x) == x and y>=0 and int(y) == y else 'No solutions'
```