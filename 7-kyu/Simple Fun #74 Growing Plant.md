https://www.codewars.com/kata/58941fec8afa3618c9000184/train/python

## Python
```python
def growing_plant(up_speed, down_speed, desired_height):
    v = up_speed
    if v >= desired_height:
        return 1
    v -= down_speed
    i = 1
    while v < desired_height:
        v += up_speed
        if v >= desired_height:
            return i+1
        v -= down_speed
        i += 1
    return i
```

## JavaScript
```js
function growingPlant(upSpeed, downSpeed, desiredHeight) {
  let v = upSpeed, i = 1;
  if (v >= desiredHeight) return i
  v -= downSpeed;
  while (v < desiredHeight) {
    v += upSpeed;
    if (v >= desiredHeight) return i+1
    v -= downSpeed;
    i++;
  }
  return i
}
```