https://www.codewars.com/kata/55225023e1be1ec8bc000390

## Python
```python
def greet(name):
    if name == "Johnny":
        return "Hello, my love!"
    return "Hello, {name}!".format(name=name)
```

## PHP
```php
function greet($name) {
  if ($name == 'Johnny') {
    return 'Hello, my love!';
  }
  return "Hello, $name!";
}
```

## JavaScript
```js
function greet(name){
  if (name == "Johnny") return "Hello, my love!";
  return "Hello, " + name + "!";
}
```

## Java
```java
public class Greeter {
  public static String greet(String name) {
    if (name.equals("Johnny")) {
      return "Hello, my love!";
    }
    return String.format("Hello, %s!", name);
  }
}
```