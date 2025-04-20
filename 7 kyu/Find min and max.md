https://www.codewars.com/kata/57a1ae8c7cb1f31e4e000130

## Python
```python
def get_min_max(seq):
    return (min(seq), max(seq))
```

## JavaScript
```js
function getMinMax(arr) {
  return [Math.min(...arr), Math.max(...arr)]
};
```

## Java
```java
import java.util.List;

class MinMax {
    static int[] getMinMax(List<Integer> list) {
        int min = list.get(0);
        int max = list.get(0);
        for (int i=1;i<list.size();i++) {
            min = Math.min(min, list.get(i));
            max = Math.max(max, list.get(i));
        }
        return new int[] {min, max};
    }
}
```