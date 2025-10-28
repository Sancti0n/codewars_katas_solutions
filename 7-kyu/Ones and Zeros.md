https://www.codewars.com/kata/578553c3a1b8d5c40300037c

## Python
```python
def binary_array_to_number(arr):
    return int(''.join(str(i) for i in arr), 2)
```

## JavaScript
```js
const binaryArrayToNumber = arr => {
  return parseInt(arr.join(''), 2)
};
```

## Java
```java
import java.util.List;

public class BinaryArrayToNumber {
  public static int ConvertBinaryArrayToInt(List<Integer> binary) {
    
    String t = "";
    for (int i=0;i<binary.size();i++) {
      t += String.valueOf(binary.get(i));
    }
    return Integer.parseInt(t, 2);
  }
}
```

## PHP
```php
function binaryArrayToNumber($arr) {
  return bindec(implode($arr));
}
```

## TypeScript
```ts
export function binaryArrayToNumber(arr: number[]): number{
  return parseInt(arr.join(''), 2)
};
```