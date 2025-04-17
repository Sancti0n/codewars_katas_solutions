https://www.codewars.com/kata/5b752a42b11814b09c00005d

## Python
```python
def solve(a,b):
    if not a or not b: return [a,b]
    if a >= 2*b: return solve(a-2*b, b)
    if (b >= 2*a): return solve(a, b-2*a)
    return [a,b]
```

## JavaScript
```js
function one(a,b) {
  if (a == 0 || b == 0) return [a,b]
  return two(a,b)
}

function three(a,b) {
  if (b >= 2*a) {
    b -= 2*a;
    return one(a,b)
  }
  return [a,b]
}

function two(a,b) {
  if (a >= 2*b) {
    a -= 2*b;
    return one(a,b)
  }
  return three(a,b)
}

function solve(a,b) {
  return one(a,b);
}
```

## Java
```java
class Solution{
  public static int [] solve(int a, int b){
    if (a == 0 || b == 0) return new int[] {a,b};
    else if (a >= 2*b) return solve(a%(2*b), b);
    else if (b >= 2*a) return solve(a, b%(2*a));
    return new int[] {a,b};
  }
}
```