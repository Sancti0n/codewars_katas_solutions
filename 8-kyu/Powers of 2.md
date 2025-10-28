https://www.codewars.com/kata/57a083a57cb1f31db7000028

## Python
```python
def powers_of_two(n):
    t = []
    for i in range(0,n+1):
        t.append(2**i)
    return t
```

## Java
```java
public class Kata{
  public static long[] powersOfTwo(int n){
    
    long t[] = new long[n+1];
    for (int i=0;i<=n;i++) {
      t[i] = (long) Math.pow(2,i);
    }
    return t;
  }
}
```

## JavaScript
```js
function powersOfTwo(n){
  t = [];
  for (let i=0;i<=n;i++) t.push(Math.pow(2,i));
  return t
}
```

## PHP
```php
function powersOfTwo(int $n): array{
  $t = [];
  for ($i=0;$i<=$n;$i++) {
    $t[] = 2**$i;
  }
  return $t;
}  
```