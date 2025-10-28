https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9

## Python
```python
def number(lines):
    t = []
    for i in range(len(lines)):
        t.append(str(i+1)+': '+lines[i])
    return t
```

## JavaScript
```js
var number=function(array) {
  let t = [];
  for (let i=0;i<array.length;i++) {
    t.push((i+1).toString()+": "+array[i]);
  }
  return t
}
```

## Java
```java
import java.util.*;

public class LineNumbering {
  public static List<String> number(List<String> lines) {
    for (int j=0;j<lines.size();j++) {
      lines.set(j, String.valueOf(j+1)+": "+lines.get(j));
    }
    return lines;
  }
}
```