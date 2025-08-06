https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1

## JavaScript
```js
function getAge(inputString){
  return Number(inputString.split(' ')[0])
}
```

## Java
```java
public class CharProblem {
  
  public static int howOld(final String herOld) {
    String age[] = herOld.split(" ");
    return Integer.parseInt(age[0]);
  }
}
```

## Python
```python
def get_age(age):
    return int(age.split(' ')[0])
```

## PHP
```php
function getAge($response) {
  return explode(" ", $response)[0];
}
```