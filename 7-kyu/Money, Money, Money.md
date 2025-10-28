https://www.codewars.com/kata/563f037412e5ada593000114

## Python
```python
def calculate_years(principal, interest, tax, desired):
    i = 0
    while principal < desired:
        principal = principal*(1 + interest*(1-tax))
        i += 1
    return i
```

## JavaScript
```js
function calculateYears(principal, interest, tax, desired) {
  let i = 0;
  while (principal < desired) {
    principal = principal*(1 + interest*(1-tax));
    i++;
  }
  return i
}
```

## Java
```java
public class Money {
  public static int calculateYears(double principal, double interest, double tax, double desired) {
    int i = 0;
    while (principal<desired) {
      principal = principal*(1 + interest*(1-tax));
      i++;
    }
    return i;
  }
}
```