https://www.codewars.com/kata/57ea0ee4491a151fc5000acf

## Python
```py
def calculate_time(battery,charger):
    a = battery*.85/charger
    b = (battery*.1)/(charger*.5)
    c = (battery*.05)/(charger*.2)
    return round(a+b+c, 2)
```

## JavaScript
```js
function calculateTime(battery,charger) {
  return Math.round(battery/charger*130)/100
}
```