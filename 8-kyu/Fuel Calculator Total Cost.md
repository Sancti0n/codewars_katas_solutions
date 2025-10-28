https://www.codewars.com/kata/57b58827d2a31c57720012e8

## Python
```python
def fuel_price(l, p):
    for i in range(2,11,2):
        if l>=i: p -= 0.05
    return round(l*p,2)
```

## JavaScript
```js
function fuelPrice(litres, pricePerLitre) {
  let p = pricePerLitre;
  if (litres>=2) p = pricePerLitre-0.05;
  if (litres>=4) p = pricePerLitre-0.1;
  if (litres>=6) p = pricePerLitre-0.15;
  if (litres>=8) p = pricePerLitre-0.2;
  if (litres>=10) p = pricePerLitre-0.25;
  return Math.round(litres*p*100)/100
}
```

## Java
```java
public class Kata{
  public static double fuelPrice(int l, double p) {
    for (int i=2;i<11;i+=2) {
      if (l>=i) p -= 0.05;
    }
    return l*p;
  }
}
```