https://www.codewars.com/kata/583989556754d6f4c700018e

## Python
```py
import math

def multiples(s1,s2,s3):
    s = math.lcm(s1, s2)
    i = 2
    t = []
    if s>s3: return t
    else: t = [s]
    while (s*i<s3):
        t.append(s*i)
        i += 1
    return t
```

## JavaScript
```js
function gcd(a, b) {
  if(!b) return b===0 ? a : NaN;
  return gcd(b, a%b);
}

function lcm(a, b) {
  return a*b/gcd(a, b);
}

function multiples(s1,s2,s3){
  let s = lcm(s1, s2), i = 1, t = [];
  if (s>s3) return t
  while (s*i<s3) {
    t.push(s*i)
    i++;
  }
  return t
}
```

## Java
```java
import java.util.*;

public class Solution {
  public static int gcd(int a, int b) {
    if (b == 0) return a;
    return gcd(b, a%b);
  }
  
  public static int lcm(int a, int b) {
    return a*b/gcd(a, b);
  }
  
  public static List<Integer> findMultiples(int s1, int s2, int s3) {
    int s = lcm(s1, s2);
    int i = 1;
    List<Integer> arr = new ArrayList<Integer>();
    if (s>s3) return arr;
    while (s*i<s3) {
      arr.add(s*i);
      i++;
    }
    return arr;
  }
}
```