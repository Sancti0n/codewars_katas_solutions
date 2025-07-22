https://www.codewars.com/kata/57a049e253ba33ac5e000212

## Python
```python
def factorial(n):
    if n == 0: return 1
    return n*factorial(n-1)
```

## JavaScript
```js
function factorial(n){
  if (n == 0) return 1
  return n*factorial(n-1)
}
```

## Java
```java
public class Factorial {
  public static long factorial(int n) {
    if (n == 0) return 1;
    return n*factorial(n-1);
    }
}
```