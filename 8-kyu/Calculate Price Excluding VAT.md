https://www.codewars.com/kata/5890d8bc9f0f422cf200006b

## Python
```python
def excluding_vat_price(price):
    if price: return round(100*price/115, 2)
    return -1
```

## PHP
```php
function excludingVatPrice($price){
  if ($price) return round(100*$price/115, 2);
  return -1;
}
```

## JavaScript
```js
function excludingVatPrice(price){
  if (price != null) return Math.round(100*price/115*100)/100
  return -1
}
```