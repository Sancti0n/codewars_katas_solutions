https://www.codewars.com/kata/575fa9afee048b293e000287

## JavaScript
```js
function howMuchWater(water, load, clothes){
  if (clothes>2*load) return "Too much clothes"
  if (clothes<load) return "Not enough clothes"
  return Math.round(water*1.1**(clothes-load)*100)/100
}
```

## Python
```python
def how_much_water(water, load, clothes):
    if clothes>2*load: return "Too much clothes"
    if clothes<load: return "Not enough clothes"
    return round(water*1.1**(clothes-load), 2)
```