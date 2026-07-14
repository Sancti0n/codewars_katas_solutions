https://www.codewars.com/kata/6507e3170b7009117e0c7865

## Python
```py
def freed_prisoners(prison):
    if not prison[0]:
        return 0
    c, i = 0, 0
    while i<len(prison):
        if prison[i]:
            c += 1
            prison = [not j for j in prison]
        i += 1
    return c
```

## JavaScript
```js
function freedPrisoners(prison) {
  if (!prison[0]) {
    return 0;
  }
  let c = 1, i = 1;
  while (i<prison.length) {
    if ((prison[i]+c)%2) {
      c++;
    }
    i++;
  }
  return c;
}
```

## Java
```java
public class Solution {
  public static int freedPrisoners(Boolean[] prison) {
    if (!prison[0]) {
      return 0;
    }
    int c = 1;
    int i = 1;
    while (i<prison.length) {
      if (((prison[i] ? 1 : 0) + c) %2 == 1) {
        c++;
      }
      i++;
    }
    return c;
  }
}
```