https://www.codewars.com/kata/57ed56657b45ef922300002b

## Python
```py
def broken(inp):
    d = {'0': '1', '1': '0'}
    res = ""
    for i in inp:
        res += d[i]
    return res
```

## JavaScript
```js
function broken(x) {
  let d = {'0': '1', '1': '0'}, res = "";
  for (let i=0;i<x.length;i++) res += d[x[i]];
  return res
}
```

## Java
```java
public class Kata {
  public static String broken(final String x) {
    String res = "";
    for (int i=0;i<x.length();i++) {
      res += String.valueOf((Integer.parseInt(String.valueOf(x.charAt(i)))+1)%2);
    }
    return res;
  }
}
```