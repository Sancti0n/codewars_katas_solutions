https://www.codewars.com/kata/58162692c2a518f03a000189

## JavaScript
```js
function time(distance,boatSpeed,stream) {
  let c = stream.indexOf("Downstream")>-1 ? boatSpeed + parseInt(stream.split(" ")[1]) : boatSpeed - parseInt(stream.split(" ")[1]);
  return Math.round(100*distance/c)/100
}
```

## Python
```python
def time(distance,boat_speed,stream):
    c = boat_speed + int(stream.split(" ")[1]) if "Downstream" in stream else boat_speed - int(stream.split(" ")[1])
    return round(distance/c, 2)
```