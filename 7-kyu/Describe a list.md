https://www.codewars.com/kata/57a4a3e653ba3346bc000810

## Python
```py
def describe_list(lst):
    return "empty" if len(lst)<1 else "singleton" if len(lst)<2 else "longer"
```

## JavaScript
```js
function describeList(x) {
  return x.length<1 ? "empty": x.length<2 ? "singleton": "longer"
}
```

## Java
```java
import java.util.*;

public class Kata {
  public static String describeList(final List list) {
    return list.size()<1 ? "empty": list.size()<2 ? "singleton": "longer";
  }
}
```