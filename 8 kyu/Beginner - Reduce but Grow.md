https://www.codewars.com/kata/57f780909f7e8e3183000078

## Python
```python
def grow(arr):
    s = 1
    for i in arr:
        s *= i
    return s
```

## JavaScript
```js
function grow(x){
  let s = 1;
  for (let i=0;i<x.length;i++) s *= x[i];
  return s
}
```

## PHP
```php
function grow($a) {
  $s = 1;
  for ($i=0;$i<count($a);$i++) $s *= $a[$i];
  return $s;
}
```

## Java
```java
public class Kata{
  public static int grow(int[] x){
    int s = 1;
    for (int i=0;i<x.length;i++) s *= x[i];
    return s;
  }
}
```