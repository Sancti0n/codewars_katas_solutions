https://www.codewars.com/kata/563d59dd8e47a5ed220000ba

## Python
```python
def get_sum_of_digits(num):
    s = 0
    digits = str(num)
    for x in digits: s += int(x)
    return s
```

## JavaScript
```js
function getSumOfDigits(integer) {
  var sum = 0;
  var digits = integer.toString();
  for(var i=0;i<digits.length;i++) {
    sum += parseInt(digits[i]);
  }
  return sum;
}
```

## Java
```java
public class Solution {
  public static int sumOfDigits(int n) {
    Integer sum = 0;
    String[] digits = (String.valueOf(n)).split("");
    for (int i=0;i<digits.length;i++) sum += Integer.parseInt(digits[i]);
    return sum;
  }
}
```