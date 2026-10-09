https://www.codewars.com/kata/5b56e42805f04b1780000073

## JavaScript
```js
function euclide(x, y) {
  return ((y[0]-x[0])**2 + (y[1]-x[1])**2)**.5;
}

function furthestDistance(arr) {
  let minimal = 0;
  let temp = 0;
  for (let i=0;i<arr.length;i++) {
    for (let j=i+1;j<arr.length;j++) {
      temp = euclide(arr[j], arr[i]);
      minimal = Math.max(minimal, temp);
    }
  }
  return Math.round(minimal*100)/100;
}
```

## Python
```py
def euclide(x, y):
    return ((y[0]-x[0])**2 + (y[1]-x[1])**2)**.5

def furthest_distance(points):
    minimal, temp = 0, 0
    for i in range(len(points)):
        for j in range(i+1, len(points)):
            temp = euclide(points[j], points[i])
            minimal = max(minimal, temp)
    return round(minimal, 2)
```