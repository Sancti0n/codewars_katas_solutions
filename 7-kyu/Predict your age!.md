https://www.codewars.com/kata/5aff237c578a14752d0035ae

## Python
```python
import math

def predict_age(age_1, age_2, age_3, age_4, age_5, age_6, age_7, age_8):
    return int((math.sqrt(age_1**2+age_2**2+age_3**2+age_4**2+age_5**2+age_6**2+age_7**2+age_8**2))/2)
```

## JavaScript
```js
function predictAge(age1,age2,age3,age4,age5,age6,age7,age8){
  return parseInt((Math.sqrt(age1**2+age2**2+age3**2+age4**2+age5**2+age6**2+age7**2+age8**2))/2)
}
```

## PHP
```php
function predictAge($age1,$age2,$age3,$age4,$age5,$age6,$age7,$age8){
  return intval((sqrt($age1**2+$age2**2+$age3**2+$age4**2+$age5**2+$age6**2+$age7**2+$age8**2))/2);
}
```

## Java
```java
public class Solution {
  public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
    return (int) (Math.sqrt(Math.pow(age1,2)+Math.pow(age2,2)+Math.pow(age3,2)+Math.pow(age4,2)+Math.pow(age5,2)+Math.pow(age6,2)+Math.pow(age7,2)+Math.pow(age8,2)))/2;
  }
}
```