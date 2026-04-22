https://www.codewars.com/kata/57f6ad55cca6e045d2000627

## Python
```py
import math
def square_or_square_root(arr):
    i = 0
    while i<len(arr):
        if (math.sqrt(arr[i]))%1 == 0:
            arr[i] = int(math.sqrt(arr[i]))
            i += 1
        else: 
            arr[i] = int(arr[i]*arr[i])
            i += 1
    return arr
```

## JavaScript
```js
function squareOrSquareRoot(array) {
  for (let i=0;i<array.length;i++) {
    Math.sqrt(array[i])%1 === 0 ? array[i] = Math.sqrt(array[i]): array[i] = array[i]*array[i];
  }
  return array;  
}
```

## PHP
```php
function squareOrSquareRoot($array) {
  $i = 0;
  while ($i<count($array)) {
    if (intval(sqrt($array[$i]))*intval(sqrt($array[$i])) == $array[$i]) {
      $array[$i] = intval(sqrt($array[$i]));
      $i++;
    }
    else {
      $array[$i] = $array[$i]*$array[$i];
      $i++;
    }
  }
  return $array;
}
```

## Java
```java
public class Kata {
  public static int[] squareOrSquareRoot(int[] array) {
    int i = 0;
    while (i<array.length) {
      if ((Math.sqrt(array[i]))%1 == 0) {
        array[i] = (int) Math.sqrt(array[i]);
        i++;
      }
      else {
        array[i] = (int) array[i]*array[i];
        i++;
      }
    }
    return array;
  }
}
```

## TypeScript
```ts
export function squareOrSquareRoot(array:number[]) : number[] {
  for (let i=0;i<array.length;i++) {
    (array[i]**.5)%1 === 0 ? array[i] = array[i]**.5 : array[i] = array[i]**2;
  }
  return array;
}
```