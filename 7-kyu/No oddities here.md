https://www.codewars.com/kata/51fd6bc82bc150b28e0000ce

## Python
```py
def no_odds(values):
    return [i for i in values if i % 2 == 0]
```

## JavaScript
```js
function noOdds(values){
  function isEven(number){
    return number%2 == 0
  }
  return values.filter(isEven)
}
```