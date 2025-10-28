https://www.codewars.com/kata/558fc85d8fd1938afb000014

## JavaScript
```js
function sumTwoSmallestNumbers(n) {  
  n.sort((a, b) => a - b)
  return n[0]+n[1]
}
```

## Python
```python
def sum_two_smallest_numbers(numbers):
    return sorted(numbers)[0]+sorted(numbers)[1]
```

## Java
```java
import java.util.Arrays;
class Kata{
  public static long sumTwoSmallestNumbers(final long [] numbers) {
    Arrays.sort(numbers);
    return numbers[0]+numbers[1];
  }             
}
```

## TypeScript
```ts
export function sumTwoSmallestNumbers(n:Array<number>):number {  
  n.sort((a, b) => a - b)
  return n[0]+n[1]
}
```