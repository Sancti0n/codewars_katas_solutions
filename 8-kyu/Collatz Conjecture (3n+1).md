https://www.codewars.com/kata/577a6e90d48e51c55e000217

## Python
```python
def hotpo(n):
    s = 0
    while n != 1:
        if n%2: n = n*3 + 1
        else: n = n//2
        s += 1
    return s
```

## JavaScript
```js
var hotpo = function(n){
  let s = 0;
  while (n != 1) {
    if (n%2) n = n*3 + 1;
    else n = n/2;
    s++;
  }
  return s  
}
```

## Java
```java
public class CollatzConjecture {  
  public static int hotpo(int n) {
    int s = 0;
    while (n != 1) {
      if (n%2 == 1) {
        n = n*3 + 1;
      }
      else {
        n /= 2;
      }
      s++;
    }
  return s;
  }
}
```