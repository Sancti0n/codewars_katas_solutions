https://www.codewars.com/kata/53dbd5315a3c69eed20002dd

## Python
```python
def filter_list(l):
    t = []
    for i in l:
        if type(i) == int and i >= 0:
            if int(i) not in t: t.append(i)
    return t
```

## JavaScript
```js
function filter_list(l) {
  let t = [];
  for (let i=0;i<l.length;i++) {
    if (typeof l[i] == "number") t.push(l[i]);
  }
  return t
}
```

## Java
```java
import java.util.*;

public class Kata {
  public static List<Object> filterList(final List<Object> list) {
    ArrayList<Object> L = new ArrayList<Object>();
    for (int i=0;i<list.size();i++) {
      if (list.get(i).getClass().getSimpleName().equals("Integer")) L.add(list.get(i));
    }  
    return L;
  }
}
```