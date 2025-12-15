https://www.codewars.com/kata/58342f14fa17ad4285000307

## Python
```py
def reach_destination(distance, speed):
    d = round(distance/speed*2)/2
    if d%1 == 0: d = int(d)
    b = 'The train will be there in '
    c = ' hour'
    return b + str(d) + c + '.' if d == 1 else b + str(d) + c + 's.'  
```

## JavaScript
```js
function reachDestination(distance, speed) {
  let d = Math.round(distance/speed*2)/2;
  if (d%1 == 0) d = parseInt(d);
  let a = "The train will be there in ", b = " hour";
  return d == 1 ? a + d.toString() + b + "." : a + d.toString() + b + "s."
} 
```