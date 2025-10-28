https://www.codewars.com/kata/5865a28fa5f191d35f0000f8

## Python
```python
def take_umbrella(weather, rain_chance):
    return True if weather=="rainy" or weather=="cloudy" and rain_chance>0.2 or weather=="sunny" and rain_chance>=0.5 else False
```

## JavaScript
```js
function takeUmbrella(weather, chance) {
  return (weather=='cloudy' && chance>0.20) || weather=='rainy' || (weather=='sunny' && chance>0.5)
}
```