https://www.codewars.com/kata/56f6919a6b88de18ff000b36

## PHP
```php
function howManyDalmations($number) {
  $dogs = ["Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"];
  return $number <= 10 ? $dogs[0] : ($number <= 50 ? $dogs[1] : ($number <= 100 ? $dogs[2] : $dogs[3]));
}
```

## Python
```python
def how_many_dalmatians(number):
    dogs = ["Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIONS!!!"]
    if number <= 10: return dogs[0]
    elif number <= 50: return dogs[1]
    elif number <= 100: return dogs[2]
    return dogs[3]
```

## JavaScript
```js
function howManyDalmatians(number) {
  var dogs = ["Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"];
  if (number <= 10) return dogs[0]
  else if (number <= 50) return dogs[1]
  else if (number <= 100) return dogs[2]
  return dogs[3]
}
```