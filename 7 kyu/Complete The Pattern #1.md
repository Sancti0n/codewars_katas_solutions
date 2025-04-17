https://www.codewars.com/kata/5572f7c346eb58ae9c000047

## Python
```python
def pattern(n):
    i = 0
    w = ""
    while i<n:
        w += str(i+1)*(i+1)+"\n"
        i += 1
    return w[:-1]
```

## Java
```java
public class Pattern1{
  public static String pattern(int n){
    if (n<=0) {
      return "";
    }
    int i = 0;
    String w = "";
    while (i<n) {
      String s = String.valueOf(i+1);
      w += s.repeat(i+1)+"\n";
      i++;
    }
    return w.substring(0,w.length()-1);
  }
}
```

## JavaScript
```js
function pattern(n){
  i = 0
  w = ""
  while (i<n) {
    w += (i+1).toString().repeat(i+1)+"\n";
    i++;
  }
  return w.substring(0,w.length-1)
}
```