https://www.codewars.com/kata/5a5c118380eba8a53d0000ce

## Python
```python
def convert_my_dollars(usd, currency):
    s1 = "You now have "
    s2 = " of "
    if currency[0] in ["A", "E", "I", "O", "U"] :return s1 + str(CONVERSION_RATES[currency]*usd) + s2 + currency + "."
    return s1 + str(int(str(CONVERSION_RATES[currency]),2)*usd) + s2 + currency + "."
```

## JavaScript
```js
function convertMyDollars(usd, currency) {
  let s1 = "You now have ", s2 = " of ";
  if ("AEIOU".indexOf(currency[0])>-1) return s1 + (CONVERSION_RATES[currency]*usd).toString() + s2 + currency + "."
  return s1 + (parseInt(CONVERSION_RATES[currency].toString(),2)*usd).toString() + s2 + currency + "."
}
```