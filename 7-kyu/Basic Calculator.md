https://www.codewars.com/kata/5296455e4fe0cdf2e000059f

## Python
```python
def calculate(num1, operation, num2):
    if operation == "/" and num2 == 0 or operation not in ["+", "-", "*", "/"]: return None
    return eval(str(num1) + operation + str(num2))
```

## JavaScript
```js
function calculate(num1, operation, num2) {
  if (operation == "/" && num2 == 0 || ["+", "-", "*", "/"].indexOf(operation)==-1) return null
  return eval(num1.toString()+operation+num2.toString())
}
```

## Java
```java
import java.util.Arrays;

public class Calculator {
  public static Double calculate(double a, String operator, double b) {
    String[] op = {"+", "-", "*", "/"};
    if (operator == "/" && b == 0 || Arrays.asList(op).contains(operator) == false) {
      return null;
    }
    else {
      if (operator == "+") return a+b;
      if (operator == "-") return a-b;
      if (operator == "*") return a*b;
      if (operator == "/") return a/b;
    }
    return 0.0;
  }
}
```