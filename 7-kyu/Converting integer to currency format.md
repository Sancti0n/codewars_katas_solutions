https://www.codewars.com/kata/54e9554c92ad5650fe00022b

## JavaScript
```js
function toCurrency(price) {
  return new Intl.NumberFormat().format(price)
}
```

## Python
```python
def to_currency(price):
    return "{:,}".format(price)
```