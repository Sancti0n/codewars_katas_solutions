https://www.codewars.com/kata/57158fb92ad763bb180004e7

## JavaScript
```js
function rainAmount(mm){
  if (mm < 40) {
    return "You need to give your plant " + (40-mm).toString() + "mm of water"
  }
  return "Your plant has had more than enough water for today!"
}
```

## Python
```python
def rain_amount(mm):
    if mm < 40:
        return "You need to give your plant " + str(40-mm) + "mm of water"
    return "Your plant has had more than enough water for today!"
```