https://www.codewars.com/kata/54c27a33fb7da0db0100040e

## TypeScript
```ts
export default function isSquare(n: number): boolean {
  return n<0 ? false : (n**.5)%1 == 0
};
```

## Python
```python
import math

def is_square(n):
    if n<0: return False
    return math.sqrt(n)%1 == 0
```

## Java
```java
public class Square {    
    public static boolean isSquare(int n) {
      if (n<0) return false;
      return Math.sqrt(n)%1 == 0;
    }
}
```

## PHP
```php
function isSquare($n){
  if ($n<0) return false;
  return intval(sqrt($n))**2 == $n;
}
```

## JavaScript
```js
var isSquare = function(n) {
  if (n<0) return false
  return Math.sqrt(n)%1 === 0
}
```