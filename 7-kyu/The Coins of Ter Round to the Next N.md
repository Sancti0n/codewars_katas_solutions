https://www.codewars.com/kata/55d38b959f9c33f3fb00007d

## Python
```python
def adjust(coin, price):
    while price%coin != 0:
        price += 1
    return price
```

## JavaScript
```js
function adjust(coin,price) {
  while (price%coin != 0) price++;
  return price
}
```