https://www.codewars.com/kata/57241e0f440cd279b5000829

## Python
```python
def sum_mul(n, m):
    if n<=0 or m<=0: return "INVALID"
    sum = 0
    for i in range(n,m,n): sum += i
    return sum
```

## JavaScript
```js
function sumMul(n,m){
    if (n>0 && m>0) {
        let i = n
        let somme = i
        while (n+i<m) {
            n = n + i
            somme += n
        }
        return somme
    }
    return "INVALID"
}
```

## Java
```java
public class Kata {
  public static long sumMul(int n, int m) {
    if (n<=0 || m<=0) {
      throw new IllegalArgumentException();
    }
    int sum = 0;
    for (int i=n;i<m;i+=n) {
      sum += i;
    }
    return sum;
  }
}
```