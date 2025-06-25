https://www.codewars.com/kata/5266876b8f4bf2da9b000362

## Python
```python
def likes(names):
    if names == []: return "no one likes this"
    elif len(names) == 1: return names[0]+" likes this"
    elif len(names) == 2: return names[0]+" and "+names[1]+" like this"
    elif len(names) == 3: return names[0]+", "+names[1]+" and "+names[2]+" like this"
    elif len(names) > 3: return names[0]+", "+names[1]+" and "+str(len(names)-2)+" others like this"
```

## PHP
```php
function likes($names) {
  if ($names == []) return "no one likes this";
  else if (count($names) == 1) return $names[0]." likes this";
  else if (count($names) == 2) return $names[0]." and ".$names[1]." like this";
  else if (count($names) == 3) return $names[0].", ".$names[1]." and ".$names[2]." like this";
  else if (count($names) > 3) return $names[0].", ".$names[1]." and ".strval(count($names)-2)." others like this";
}
```

## JavaScript
```js
function likes(names) {
  if (names.length == 0) return "no one likes this"
  else if (names.length == 1) return names[0]+" likes this"
  else if (names.length == 2) return names[0]+" and "+names[1]+" like this"
  else if (names.length == 3) return names[0]+", "+names[1]+" and "+names[2]+" like this"
  else if (names.length > 3) return names[0]+", "+names[1]+" and "+(names.length-2).toString()+" others like this"
}
```

## Java
```java
class Solution {
  public static String whoLikesIt(String... names) {
    switch(names.length) {
      case 0: return "no one likes this";
      case 1: return names[0]+" likes this";
      case 2: return names[0]+" and "+names[1]+" like this";
      case 3: return names[0]+", "+names[1]+" and "+names[2]+" like this";
      default: return names[0]+", "+names[1]+" and "+String.valueOf(names.length-2)+" others like this";
    }
  }
}
```