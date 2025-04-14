https://www.codewars.com/kata/55ffb44050558fdb200000a4

## Python
```python
def sum_dig_nth_term(init_val, pattern_l, nth_term):
    s = init_val
    for i in range(nth_term-1):
        s += pattern_l[i%len(pattern_l)]
    return sum(list(map(int, str(s))))
```

## JavaScript
```js
function sumDigNthTerm(initVal, patternL, nthTerm) {
  let s = initVal;
  for (let i=0;i<nthTerm-1;i++) {
    s += patternL[i%patternL.length];
  }
  return Array.from(String(s), Number).reduce((p, c) => p + c, 0)
}
```

## Java
```java
public class SumDigNth {
  public static long sumArr(long a) {
    long sum = 0;
    String temp = Long.toString(a);
    for (int i=0;i<temp.length();i++) {
      sum += temp.charAt(i) - '0';
    }
    return sum;
  }
  
  public static long sumDigNthTerm(long initval, long[] patternl, int nthterm) {
    long s = initval;
    for (long i=0L;i<nthterm-1;i++) {
      s += patternl[(int) i%patternl.length];
    }
    return sumArr(s);
  }
}
```