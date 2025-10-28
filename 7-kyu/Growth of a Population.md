https://www.codewars.com/kata/563b662a59afc2b5120000c6

## Python
```python
def nb_year(p0, percent, aug, p):
    nb = int(p0 + p0*(percent/100) + aug)
    i = 1
    while nb < p:
        nb = int(nb + nb*(percent/100) + aug)
        i += 1
    return i
```

## PHP
```php
function nbYear($p0, $percent, $aug, $p) {
  $nb = intval($p0 + $p0*($percent/100) + $aug);
  $i = 1;
  while ($nb < $p) {
    $nb = intval($nb + $nb*($percent/100) + $aug);
    $i++;
  }
  return $i;
}
```

## JavaScript
```js
function nbYear(p0, percent, aug, p) {
  let nb = parseInt(p0 + p0*(percent/100) + aug);
  let i = 1;
  while (nb<p) {
    nb = parseInt(nb + nb*(percent/100) + aug);
    i++;
  }
  return i
}
```

## Java
```java
class Arge {
  public static int nbYear(int p0, double percent, int aug, int p) {
    int nb = (int) (p0 + p0*(percent/100) + aug);
    int i = 1;
    while (nb<p) {
      nb = (int) (nb + nb*(percent/100) + aug);
      i++;
    }
    return i;
  }
}
```