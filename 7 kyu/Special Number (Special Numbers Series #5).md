https://www.codewars.com/kata/5a55f04be6be383a50000187

## Python
```python
def special_number(number):
    n = sorted(str(number), reverse=True)
    return "NOT!!" if int(n[0])>5 else "Special!!"
```

## JavaScript
```js
function specialNumber(n){
  return Math.max(...Array.from(String(n), Number))>5 ? "NOT!!" : "Special!!"
}
```

## PHP
```php
function specialNumber($n) {
  $n = array_map('intval', str_split($n));
  return max($n) > 5 ? "NOT!!" : "Special!!";
}
```

## Java
```java
public class Solution {
  public static String specialNumber(int num) {
    String nStr = Integer.toString(num);
    for (int i=0;i<nStr.length();i++) {
      if (Character.getNumericValue(nStr.charAt(i))>5) return "NOT!!";
    }
    return "Special!!";
  }
}
```