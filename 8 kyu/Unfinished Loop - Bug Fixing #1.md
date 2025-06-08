https://www.codewars.com/kata/55c28f7304e3eaebef0000da

## JavaScript
```js
function createArray(number){
  var newArray = [];
  for(var counter = 1;counter <= number;counter++){
    newArray.push(counter);
  }
  return newArray;
}
```

## Python
```python
def create_array(n):
    res=[]
    i=1
    while i<=n:
        res += [i]
        i += 1
    return res
```

## PHP
```php
function createArray($number){
  $newArray = array();
  for($count = 1; $count <= $number;$count++){
    $newArray[] = $count;
  }
  return $newArray;
}
```

## Java
```java
import java.util.*;

class Kata {
  public static List CreateList(int number) {
    List list = new ArrayList();
    for(int count = 1; count <= number;count++) list.add(count);
    return list;
  }
}
```