https://www.codewars.com/kata/574c5075d27783851800169e

## Python
```py
def animals(heads, legs):
    x = heads-(legs-2*heads)/2
    y = (legs-2*heads)/2
    if x<0 or y<0 or legs%2 == 1: return "No solutions"
    return (x,y)
```

## JavaScript
```js
function animals(heads, legs){
  let x = heads-(legs-2*heads)/2;
  let y = (legs-2*heads)/2;
  if (x<0 || y<0 || legs%2 == 1) return "No solutions"
  return [x,y]
}
```