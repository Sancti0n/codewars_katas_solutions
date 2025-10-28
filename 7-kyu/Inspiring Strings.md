https://www.codewars.com/kata/5939ab6eed348a945f0007b2

## Python
```python
def longest_word(s):
    s = s.split(" ")
    a, b = [len(s[0]), s[0]]
    for i in s:
        if len(i)>=a:
            a, b = [len(i), i]
    return b
```

## JavaScript
```js
function longestWord(s) {
  s = s.split(" ");
  let a = s[0].length;
  let b = s[0];
  for (let i=0;i<s.length;i++) {
    if (s[i].length>=a) {
      a = s[i].length;
      b = s[i];
    }
  }
  return b
}
```

## Java
```java
public class Kata {
  public static String longestWord(String wordString) {
    String[] s = wordString.split(" ");
    int a = s[0].length();
    String b = s[0];
    for (int i=1;i<s.length;i++) {
      if (s[i].length()>=a) {
        a = s[i].length();
        b = s[i];
      }
    }
    return b;
  }
}
```