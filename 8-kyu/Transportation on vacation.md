https://www.codewars.com/kata/568d0dd208ee69389d000016

## Python
```python
def rental_car_cost(d):
    if d>=7: return d*40-50
    if d>=3: return d*40-20
    return d*40
```

## JavaScript
```js
function rentalCarCost(d) {
  if (d>=7) return d*40-50
  if (d>=3) return d*40-20
  return d*40
}
```

## Java
```java
public class Kata {
  public static int rentalCarCost(int d) {
    if (d>=7) return d*40-50;
    if (d>=3) return d*40-20;
    return d*40;
  }
}
```