https://www.codewars.com/kata/5701e43f86306a615c001868

## Python
```python
def get_issuer(number):
    if len(str(number)) == 15 and str(number)[:2] in ["34", "37"]: return "AMEX"
    if len(str(number)) == 16 and str(number)[:4] == "6011": return "Discover"
    if len(str(number)) == 16 and str(number)[:2] in ["51", "52", "53", "54", "55"]: return "Mastercard"
    if (len(str(number)) == 13 or len(str(number)) == 16) and str(number)[0] == "4": return "VISA"
    return "Unknown"
```

## JavaScript
```js
function getIssuer(number) {
  let n = number.toString();
  if (n.length == 15 && ["34", "37"].indexOf(n.slice(0,2))>-1) return "AMEX"
  if (n.length == 16 && n.slice(0,4) == "6011") return "Discover"
  if (n.length == 16 && ["51", "52", "53", "54", "55"].indexOf(n.slice(0,2))>-1) return "Mastercard"
  if ((n.length == 13 || n.length == 16) && n[0] == "4") return "VISA"
  return "Unknown"
}
```