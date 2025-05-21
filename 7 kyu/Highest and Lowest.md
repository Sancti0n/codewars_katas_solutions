https://www.codewars.com/kata/554b4ac871d6813a03000035

## JavaScript
```js
function highAndLow(numbers){
    let x = numbers.split(' ')
    for (let i=0;i<x.length;i++) {
        x[i] = parseInt(x[i])
    }
    let w = Math.max(...x).toString() + ' ' + Math.min(...x).toString()
    return w
}
```

## Python
```python
def high_and_low(numbers):
    n = list(map(int,numbers.split(' ')))
    return str(max(n))+" "+str(min(n))
```

## PHP
```php
function highAndLow($numbers) {
  $t = explode(" ", $numbers);
  sort($t);
  return $t[count($t)-1]." ".$t[0];
}
```

## Java
```java
public class Kata {
  public static String highAndLow(String numbers) {
    String[] t = numbers.split(" ");
    int min = Integer.parseInt(t[0]);
    int max = Integer.parseInt(t[0]);
    for (int i=1;i<t.length;i++) {
      if (min>Integer.parseInt(t[i])) min = Integer.parseInt(t[i]);
      if (max<Integer.parseInt(t[i])) max = Integer.parseInt(t[i]);
    }
    return String.valueOf(max)+" "+String.valueOf(min);
  }
}
```