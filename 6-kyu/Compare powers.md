https://www.codewars.com/kata/55b2549a781b5336c0000103

## Python
```python
import math

def compare_powers(n1,n2):
    if n1 == n2 or n1[0] == n2[0] == 1: return 0
    if n1[1]*math.log(n1[0]) > n2[1]*math.log(n2[0]): return -1
    return 1
```

## JavaScript
```js
function comparePowers(n1,n2){
  if (JSON.stringify(n1) == JSON.stringify(n2) || n1[0] == 1 && n2[0] == 1) return 0
  if (n1[1]*Math.log(n1[0]) > n2[1]*Math.log(n2[0])) return -1
  return 1
}
```

## Java
```java
import java.util.Arrays;

public class Compare {
  public static int comparePowers(int[] number1, int[] number2) {
    if (Arrays.equals(number1,number2) || number1[0] == 1 && number2[0] == 1) return 0;
    if (number1[1]*Math.log(number1[0]) > number2[1]*Math.log(number2[0])) return -1;
    return 1;
  }
}
```