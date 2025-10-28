https://www.codewars.com/kata/51dda84f91f5b5608b0004cc

## Python
```python
def solution(number):
    A, B, C = [0, 0, 0]
    for i in range(1, number):
        if i%15 == 0: C += 1
        elif i%3 == 0 and i%5 != 0: A += 1
        elif i%3 != 0 and i%5 == 0: B += 1
    return [A, B, C]
```

## JavaScript
```js
function solution(number) {
  let A = 0, B = 0, C = 0;
  for (let i=1;i<number;i++) {
    if (i%15 == 0) C++;
    else if (i%3 == 0 && i%5 != 0) A++;
    else if (i%3 != 0 && i%5 == 0) B++;
  }
  return [A, B, C]
}
```

## Java
```java
public class FizzBuzz{
  public static int[] solution(int number) {
    int A = 0;
    int B = 0;
    int C = 0;
    for (int i=1;i<number;i++) {
      if (i%15 == 0) C++;
      else if (i%3 == 0 && i%5 != 0) A++;
      else if (i%3 != 0 && i%5 == 0) B++;
    }
    return new int[] {A, B, C};
  }
}
```