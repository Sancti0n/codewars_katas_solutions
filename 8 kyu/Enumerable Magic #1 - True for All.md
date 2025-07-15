https://www.codewars.com/kata/54598d1fcbae2ae05200112c

## Python
```python
def _all(seq, fun):
    for i in range(len(seq)):
        if not fun(seq[i]): return False
    return True
```

## JavaScript
```js
function all(seq, fun){
  for (let i=0;i<seq.length;i++) {
    if (!fun(seq[i])) return false
  }
  return true
}
```

## Java
```java
import java.util.function.IntPredicate;

public class Solution{
  public static boolean all(int[] list, IntPredicate predicate){
    // REMINDER: a Predicate "p" is tested for argument "arg" using p.test(arg)
    for (int i=0;i<list.length;i++) {
      if (!predicate.test(list[i])) {
        return false;
      }
    }
    return true;
  }
}
```