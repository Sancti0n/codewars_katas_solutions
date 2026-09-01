https://www.codewars.com/kata/5d65fbdfb96e1800282b5ee0

## Python
```py
def wrap(height, width, length):
    dims = sorted([height, width, length])
    return 4*dims[0] + 2*dims[1] + 2*dims[2] + 20
```

## JavaScript
```js
function wrap(height, width, length) {
  let t = [height, width, length];
  t.sort((a,b)=>a-b);
  return 4*t[0] + 2*(t[1] + t[2]) + 20
}
```

## Java
```java
import java.util.Arrays;

public class WrapPresent{

	public static int wrap(int height, int width, int length){
    int[] arr = {height, width, length};
    Arrays.sort(arr);
    return 4*arr[0] + 2*(arr[1] + arr[2]) + 20;
  }
}

```