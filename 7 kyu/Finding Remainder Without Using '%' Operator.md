https://www.codewars.com/kata/564f458b4d75e24fc9000041

## JavaScript
```js
const remainder = (D, d) => {
  while (D>=d) {
    D = D-d;
  }
  return D
};
```

## Python
```python
def remainder(D,d):
    while D>=d:
        D -= d
    return D
```

## Java
```java
class RemainderFinder {
  
  public static SimpleInteger remainder(SimpleInteger D, SimpleInteger d) {
    while (D.compareTo(d)>-1) {
      D = D.subtract(d);
    }
    return D;
  }
}
```