https://www.codewars.com/kata/56e56756404bb1c950000992

## Python
```python
def pgcd(a, b):
    if(b == 0): return a
    return pgcd(b, a%b)

def sum_differences_between_products_and_LCMs(pairs):
    if len(pairs) == 0: return 0
    s = 0
    for i in pairs:
        i.sort(reverse=True)
        if pgcd(i[0],i[1]) != 0:
            s += i[0]*i[1] - (i[0]*i[1])/pgcd(i[0],i[1])
    return s
```

## JavaScript
```js
function pgcd(a, b) {
  if (b == 0) return a
  return pgcd(b,a%b)
}

function sumDifferencesBetweenProductsAndLCMs(pairs) {
  if (pairs.length == 0) return 0
  let s = 0;
  for (let i=0;i<pairs.length;i++) {
    pairs[i].sort((a,b)=>b-a);
    if (pgcd(pairs[i][0], pairs[i][1]) != 0) {
      s += pairs[i][0]*pairs[i][1] - (pairs[i][0]*pairs[i][1])/pgcd(pairs[i][0],pairs[i][1]);
    }
  }
  return s
}
```

## Java
```java
import java.util.Arrays;

public class Solution {
  
  public static int pgcd(int a, int b) {
    if (b == 0) return a;
    return pgcd(b,a%b);
  }
  
  public static int sumDifferencesBetweenProductsAndLCMs(final int[][] pairs) {
    if (pairs.length<1) return 0;
    int s = 0;
    for (int i=0;i<pairs.length;i++) {
      Arrays.sort(pairs[i]);
      if (pgcd(pairs[i][0], pairs[i][1]) != 0) {
        s += pairs[i][0]*pairs[i][1] - (pairs[i][0]*pairs[i][1])/pgcd(pairs[i][0],pairs[i][1]);
      }
    }
    return s;
  }
}
```