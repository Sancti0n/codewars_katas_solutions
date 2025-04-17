https://www.codewars.com/kata/5ff50f64c0afc50008861bf0

## Python
```python
def solution(n):
    nums = {4: 7, 7:4}
    return nums.get(n, False)
```

## JavaScript
```js
function fourSeven(n){
  let num = {4:7, 7:4};
  return (n == 4 || n == 7) && num[n]
}
```

## PHP
```php
function solution($n){
  $num = ["4"=> 7, "7"=>4];
  return ($n == 4 || $n == 7) && $num[strval($n)];
}
```

## Java
```java
import java.util.*;

public class Kata{
  public static int fourSeven(Integer n){
    HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();
    t.put(n, 0);
    t.put(4, 7);
    t.put(7, 4);
    return t.get(n);
  }
}
```