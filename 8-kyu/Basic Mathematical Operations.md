https://www.codewars.com/kata/57356c55867b9b7a60000bd7

## Python
```python
def basic_op(o, v1, v2):
    return eval(str(v1)+o+str(v2))
```

## JavaScript
```js
function basicOp(o, v1, v2){
  return eval(v1+o+v2)
}
```

## PHP
```php
function basicOp($o, $v1, $v2) {
  return eval("return {$v1}{$o}{$v2};");
}
```

## Java
```java
public class BasicOperations {
  public static Integer basicMath(String op, int v1, int v2) {
    switch(op){
      case "-": return v1-v2;
      case "+": return v1+v2;
      case "/": return v1/v2;
      case "*": return v1*v2;
    }
    return 0;
  }
}
```