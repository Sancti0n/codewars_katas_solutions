https://www.codewars.com/kata/546e2562b03326a88e000020

## JavaScript
```js
function squareDigits(num){
  let n = num.toString()
  let w = ''
  for (let i=0;i<n.length;i++) {
    w += Math.pow(Number(n[i]),2).toString()
  }
  return Number(w)
}
```

## Python
```python
import math
def square_digits(num):
    n = str(num)
    w = ''
    for i in range(len(n)):
        w += str(int(n[i])**2)
    return int(w)
```

## PHP
```php
function square_digits($num){
  $n = strval($num);
  $w = '';
  for ($i=0;$i<strlen($n);$i++) {
    $w .= strval(intval($n[$i]**2));
  }
  return intval($w);
}
```

## Java
```java
public class SquareDigit {
  public int squareDigits(int n) {
    String ns = String.valueOf(n);
    String[] arr = ns.split("");
    String w = "";
    for (int i=0;i<arr.length;i++) {
      w = w + String.valueOf((int) Math.pow(Integer.parseInt(arr[i]), 2));
    }
    return Integer.parseInt(w);
  }
}
```