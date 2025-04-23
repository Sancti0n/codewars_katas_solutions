https://www.codewars.com/kata/5b18e9e06aefb52e1d0001e9

## JavaScript
```js
function riders(stations) {
  let c = 1, s = 0;
  for (let i=0;i<stations.length;i++) {
    s += stations[i];
    if (s>100) {
      c++;
      s = stations[i];
    }
  }
  return c
}
```

## Python
```python
def riders(stations):
    c, s = [1,0]
    for i in range(len(stations)):
        s += stations[i]
        if s>100:
            c += 1
            s = stations[i]
    return c
```