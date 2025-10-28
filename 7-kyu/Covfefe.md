https://www.codewars.com/kata/592fd8f752ee71ac7e00008a

## Python
```python
def covfefe(s):
    if "coverage" in s: s = s.replace("coverage", "covfefe")
    elif "coverage" not in s: s += " covfefe"
    return s
```

## JavaScript
```js
function covfefe(str){
  return str.indexOf("coverage")>-1 ? str.replace(/coverage/g, 'covfefe') : str + " covfefe"
}
```

## Java
```java
public class Covfefe {
  public static String covfefe(String tweet) {
    return tweet.indexOf("coverage")>-1 ? tweet.replace("coverage", "covfefe") : tweet + " covfefe";
  }
}
```