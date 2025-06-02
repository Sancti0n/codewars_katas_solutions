https://www.codewars.com/kata/5dd259444228280032b1ed2a

## JavaScript
```js
function solve(s,g){
  return s%g != 0 ? -1 : [g,s-g]
}
```

## Python
```python
def euclide(a, b):
    while b != 0:
        t = b
        b = a%b
        a = t
    return a

def solve(s,g):
    i = 1
    if s%g != 0: return -1
    while euclide(i,s-i) != g:
        i+=1
    return (i,s-i)
```

## Java
```java
class GCDsum{
  public static int[] solve(int s, int g){
    return s%g != 0 ? new int[] {-1,-1}: new int[] {g,s-g};
  }
}
```