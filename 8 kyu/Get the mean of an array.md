https://www.codewars.com/kata/563e320cee5dddcf77000158

## Python
```python
def get_average(marks):
    return int(sum(marks)/len(marks))
```

## JavaScript
```js
function getAverage(marks){
  return parseInt((marks.reduce((p, c) => p + c, 0))/marks.length)
}
```

## PHP
```php
function get_average($a) {
  return intval(array_sum($a)/count($a));
}
```

## Java
```java
public class School {
    public static int getAverage(int[] marks) {
        int sum = 0;
        for (int i=0;i<marks.length;i++) {
            sum = sum + marks[i];
        }
        return sum/marks.length;
    }
}
```