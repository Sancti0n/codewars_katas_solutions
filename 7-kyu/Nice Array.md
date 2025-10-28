https://www.codewars.com/kata/59b844528bcb7735560000a0

## Python
```python
def is_nice(arr):
    for i in arr:
        if i-1 not in arr and i+1 not in arr:
            return False
    return len(arr)>0
```

## JavaScript
```js
function isNice(arr) {
  for (let i=0;i<arr.length;i++) {
    if (arr.indexOf(arr[i]-1)<0 && arr.indexOf(arr[i]+1)<0) return false
  }
  return arr.length>0
}
```

## PHP
```php
function isNice($arr) {
  for ($i=0;$i<count($arr);$i++) {
    if (in_array($arr[$i]-1, $arr)<1 && in_array($arr[$i]+1, $arr)<1) return false;
  }
  return count($arr)>0;
}
```

## Java
```java
import java.util.*;

public class Kata{
  public static boolean isNice(Integer[] arr){
    for (int i=0;i<arr.length;i++) {
      if (Arrays.asList(arr).contains(arr[i]-1)==false && Arrays.asList(arr).contains(arr[i]+1)==false) {
        return false;
      }
    }
    return arr.length>0;
  }
}
```

## TypeScript
```ts
export function isNice(arr:number[]): boolean {
  for (let i=0;i<arr.length;i++) {
    if (arr.indexOf(arr[i]-1)<0 && arr.indexOf(arr[i]+1)<0) return false
  }
  return arr.length>0 
}
```