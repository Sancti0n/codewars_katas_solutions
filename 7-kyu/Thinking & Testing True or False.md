https://www.codewars.com/kata/56d931ecc443d475d5000003

## Python
```python
def testit(n):
    return bin(n).count('1')
```

## JavaScript
```js
function testit(n){
  return (n.toString(2).match(new RegExp("1", "g")) || []).length
}
```

## Java
```java
public class ThinkingAndTesting {

  public static int testTrueFalse(int n) {
    String r = Integer.toBinaryString(n);
    return r.length() - r.replace("1", "").length();
  }
}
```