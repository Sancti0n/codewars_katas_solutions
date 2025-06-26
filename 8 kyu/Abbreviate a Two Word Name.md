https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3

## Python
```python
def abbrev_name(name):
    x = name.split(' ')
    return x[0][0].upper()+'.'+x[1][0].upper()
```

## JavaScript
```js
function abbrevName(name){
  return name.split(" ")[0][0].toUpperCase()+"."+name.split(" ")[1][0].toUpperCase()
}
```

## PHP
```php
function abbrevName($name) {
  $x = explode(" ", $name);
  return strtoupper($x[0][0]).'.'.strtoupper($x[1][0]);
}
```

## Java
```java
public class AbbreviateTwoWords {
  public static String abbrevName(String name) {
    String n[] = name.split(" ");
    for (int i=0;i<n.length;i++) {
      n[i] = n[i].substring(0, 1).toUpperCase();
    }
    return String.join(".", n);
  }
}
```