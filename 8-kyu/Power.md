https://www.codewars.com/kata/562926c855ca9fdc4800005b

## JavaScript
```js
function numberToPower(number, power){
  let v = 1;
  for (let i=0;i<power;i++) {
    v *= number;
  }
  return v
}
```

## Python
```python
def number_to_pwr(number, p):
    v = 1
    for i in range(p):
        v *= number
    return v
```