https://www.codewars.com/kata/58356a94f8358058f30004b5

## JavaScript
```js
function flyBy(lamps, drone) {
  return drone.length>=lamps.length ? "o".repeat(lamps.length): "o".repeat(drone.length) + lamps.substring(drone.length)
}
```

## Python
```python
def fly_by(lamps, drone):
    if len(drone)>=len(lamps): return 'o'*len(lamps)
    return 'o'*len(drone) + lamps[len(drone):]
```