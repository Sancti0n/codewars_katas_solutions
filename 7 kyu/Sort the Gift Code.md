https://www.codewars.com/kata/52aeb2f3ad0e952f560005d3

## Python
```python
def sort_gift_code(code):
    return "".join(sorted(code))
```

## JavaScript
```js
function sortGiftCode(code) {
  return code.split("").sort().join("")
}
```

## Java
```java
import java.util.Arrays;

public class GiftSorter {
    public String sortGiftCode(String code) {
        String t[] = code.split("");
        Arrays.sort(t);
        return String.join("", t);
    }
}
```