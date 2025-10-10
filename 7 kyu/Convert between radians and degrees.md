https://www.codewars.com/kata/544e2c60908f2da03600022a

## Python
```python
def degrees(rad):
    return '%gdeg' % round(180 * rad / math.pi, 2)

def radians(deg):
    return '%grad' % round(math.pi * deg / 180, 2)

math.degrees=degrees
math.radians=radians
```

## JavaScript
```js
function degrees(rad) {
  return (Math.round(18000*rad/Math.PI)/100).toString() + "deg"
}

function radians(deg) {
  return (Math.round(Math.PI*deg/1.80)/100) + "rad"
}

Math.degrees = degrees
Math.radians = radians
```