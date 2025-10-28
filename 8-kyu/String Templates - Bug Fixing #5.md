https://www.codewars.com/kata/55c90cad4b0fe31a7200001f

## Python
```python
def build_string(*args):
    return "I like {}!".format(", ".join(args))
```

## JavaScript
```js
function buildString(...template){
  return `I like ${template.join(', ')}!`;
}
```

## Java
```java
public class Kata {
  public static String buildString(String... args) {
    return "I like "+String.join(", ", args)+"!";
  }
}
```