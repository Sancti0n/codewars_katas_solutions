https://www.codewars.com/kata/54edbc7200b811e956000556

## JavaScript
```js
function countSheeps(arr) {
  return arr.filter(Boolean).length;
}
```

## Python
```python
def count_sheeps(sheep):
    return sheep.count(True)
```

## Java
```java
public class Counter {
  public int countSheeps(Boolean[] arr) {
    int c = 0;
    for (int i=0;i<arr.length;i++) {
      if (arr[i] != null && arr[i] == true) c++;
    }
    return c;
  }
}
```

## PHP
```php
function countSheep($arr) {
  return count(array_filter($arr));
}
```