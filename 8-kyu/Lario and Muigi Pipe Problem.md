https://www.codewars.com/kata/56b29582461215098d00000f

## Java
```java
public class Kata {
  public static int[] pipeFix(int[] numbers) {
    int t[] = new int[numbers[numbers.length-1]-numbers[0]+1];
    int min = numbers[0];
    int max = numbers[numbers.length-1];
    for (int i=0;i<(max-min+1);i++) {
      t[i] = min + i;
    }
    return t;
  }
}
```

## JavaScript
```js
function pipeFix(numbers){
  return new Array(Math.max(...numbers)+ 1 - Math.min(...numbers)).fill().map((d, i) => i + Math.min(...numbers));
}
```

## Python
```python
def pipe_fix(nums):
    return list(range(nums[0], nums[len(nums)-1]+1))
```

## PHP
```php
function pipeFix($numbers) {
  return range($numbers[0], $numbers[count($numbers)-1]);
}
```