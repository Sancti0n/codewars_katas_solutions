https://www.codewars.com/kata/63f96036b15a210058300ca9

## Python
```python
def second_symbol(s, symbol):
    c = 0
    for i in range(len(s)):
        if s[i] == symbol: c += 1
        if c>1: return i
    return -1
```

## Java
```java
public class SecondOcurrence {
  public static int secondSymbol(String str, char c) {
    int count = 0;
    String[] t = str.split("");
    String s = String.valueOf(c);
    for (int i=0;i<t.length;i++) {
      if (t[i].equals(s)) count++;
      if (count == 2) return i;
    }
    return -1;
  }
}
```

## JavaScript
```js
function secondSymbol(s, symbol) {
  let c = 0;
  for (let i=0;i<s.length;i++) {
    if (s[i] == symbol) c++;
    if (c>1) return i
  }
  return -1
}
```