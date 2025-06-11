https://www.codewars.com/kata/515e271a311df0350d00000f

## Python
```python
def square_sum(numbers):
    somme = 0
    for i in numbers:
        somme += i**2
    return somme
```

## JavaScript
```js
function squareSum(numbers){
  let somme = 0
  for (let i=0;i<numbers.length;i++) somme += Math.pow(numbers[i],2)
  return somme
}
```

## PHP
```php
function square_sum($numbers) {
  $somme = 0;
  for ($i=0;$i<count($numbers);$i++) {
    $somme += pow($numbers[$i],2);
  }
  return $somme;
}
```

## Java
```java
public class Kata {
  public static int squareSum(int[] n) {
    int somme = 0;
    for (int i=0;i<n.length;i++) {
      somme += Math.pow(n[i], 2);
    }
    return somme;
  }
}
```

## Dart
```dart
import "dart:math";

num squareSum(List numbers) {
  num s = 0;
  for (int i=0;i<numbers.length;i++) {
    s += pow(numbers[i], 2);
  }
  return s;
}
```