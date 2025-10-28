https://www.codewars.com/kata/5302d846be2a9189af0001e4

## Python
```python
def say_hello(name, city, state):
    return "Hello, "+" ".join(name)+"! Welcome to "+city+", "+state+"!"
```

## JavaScript
```js
function sayHello(name, city, state) {
  return "Hello, "+name.join(" ")+"! Welcome to "+city+", "+state+"!"
}
```

## Java
```java
public class Hello{
  public String sayHello(String [] name, String city, String state){
    return "Hello, "+String.join(" ", name)+"! Welcome to "+city+", "+state+"!";
  }
}
```