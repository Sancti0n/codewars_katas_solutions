https://www.codewars.com/kata/58545549b45c01ccab00058c

## Python
```python
def calculate_total(subtotal, tax, tip):
    return round(subtotal*(1 + tax/100 + tip/100), 2)
```

## JavaScript
```js
function calculate_total(subtotal, tax, tip) {
  return parseFloat((subtotal*(1 + tax/100 + tip/100)).toFixed(2))
}
```