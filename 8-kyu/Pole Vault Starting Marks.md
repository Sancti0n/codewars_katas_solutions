https://www.codewars.com/kata/5786f8404c4709148f0006bf

## JavaScript
```js
function startingMark(bodyHeight) {
  let m = (10.67-9.45)/(1.83-1.52);
  let p = 9.45 - m*1.52;
  let r = m*bodyHeight + p;
  return Math.round(r*100)/100;
}
```

## Python
```py
def starting_mark(height):
    m = (10.67-9.45)/(1.83-1.52)
    p = 9.45 - m*1.52
    r = m*height + p
    return round(r, 2)
```