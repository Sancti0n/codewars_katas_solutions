https://www.codewars.com/kata/552564a82142d701f5001228

## Python
```python
def discover_original_price(discounted_price, sale_percentage):
    return round(discounted_price*100/(100-sale_percentage), 2)
```

## JavaScript
```js
function discoverOriginalPrice(discountedPrice, salePercentage){
  return Math.round(discountedPrice*100/(100-salePercentage)*100)/100
}
```