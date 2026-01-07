https://www.codewars.com/kata/514b92a657cdc65150000006

## Python
```python
def solution(number):
    i, somme = 1, 0
    while i<number:
        if i%3 == 0 or i%5 == 0:
          somme += i
        i += 1
    return somme
```

## PHP
```php
function solution($number){
  $i = 1;
  $s = 0;
  while ($i<$number) {
    if ($i%3 == 0 || $i%5 == 0) {
      $s += $i;
    }
    $i++;
  }
  return $s;
}
```

## JavaScript
```js
function solution(number){
  let [i, somme] = [1, 0];
  while (i<number) {
    if (i%3 == 0 || i%5 == 0) {
      somme += i;
    }
    i++;
  }
  return somme
}
```

## Java
```java
public class Solution {
  public int solution(int number) {
    int i = 1;
    int somme = 0;
    while (i<number) {
      if (i%3 == 0 || i%5 == 0) {
        somme += i;
      }
      i++;
    }
    return somme;
  }
}
```