https://www.codewars.com/kata/5720a1cb65a504fdff0003e2

## Python
```python
def difference_in_ages(ages):
    return (min(ages), max(ages), max(ages)-min(ages))
```

## JavaScript
```js
function differenceInAges(ages){
  return [Math.min(...ages), Math.max(...ages), Math.max(...ages)-Math.min(...ages)]
}
```

## PHP
```php
function differenceInAges($ages) {
  return [min($ages), max($ages), max($ages)-min($ages)];
}
```