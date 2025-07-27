https://www.codewars.com/kata/562f91ff6a8b77dfe900006e

## Python
```python
import math

def movie(card, ticket, perc):
    n = 1
    while math.ceil(card + ticket*perc*((1-perc**(n))/(1-perc))) - ticket*n >= 0:
        n += 1
    return n
```

## PHP
```php
function movie($card, $ticket, $perc) {
  $n = 1;
  while (ceil($card + $ticket*$perc*((1-$perc**$n)/(1-$perc))) - $ticket*$n >= 0) $n++;
  return $n;
}
```

## JavaScript
```js
function movie(card, ticket, perc) {
  let n = 1;
  while (Math.ceil(card + ticket*perc*((1-perc**n)/(1-perc))) - ticket*n >= 0) n++;
  return n
};
```

## Java
```java
public class Movie {
  public static int movie(int card, int ticket, double perc) {
    int n = 1;
    while (Math.ceil(card + ticket*perc*((1-Math.pow(perc,n))/(1-perc))) - ticket*n >= 0) n++;
    return n;
  }
}
```

## TypeScript
```ts
export function movie(card: number, ticket: number, perc: number): number {
  let n = 1;
  while (Math.ceil(card + ticket*perc*((1-perc**n)/(1-perc))) - ticket*n >= 0) n++;
  return n
}
```