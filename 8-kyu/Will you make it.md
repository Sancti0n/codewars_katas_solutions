https://www.codewars.com/kata/5861d28f124b35723e00005e

## SQL
```sql
SELECT distance_to_pump, mpg, fuel_left, mpg*fuel_left>=distance_to_pump AS res FROM zerofuel
```

## Java
```java
public class Kata {
    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        if (mpg*fuelLeft>=distanceToPump) return true;
        return false;
    }
}
```

## JavaScript
```js
const zeroFuel = (d, m, f) => {
  return m*f>=d;
};
```

## Python
```python
def zero_fuel(d, m, f):
    return m*f>=d
```

## PHP
```php
function zeroFuel($d, $m, $f) {
  return $m*$f>=$d;
}
```

## TypeScript
```ts
export const zeroFuel = (d: number, m: number, f: number): boolean => {
  return m*f>=d;
};
```