https://www.codewars.com/kata/56efc695740d30f963000557

## Python
```python
def to_alternating_case(string):
    w = ''
    for i in range(len(string)):
        if string[i].isupper(): w += string[i].lower()
        elif string[i].islower(): w += string[i].upper()
        elif not(string[i].isupper()) or not(string[i].islower()): w += string[i]
    return w
```

## JavaScript
```js
String.prototype.toAlternatingCase = function () {
  let t = this.split("");
  for (let i=0;i<t.length;i++) {
    if (t[i].toLowerCase() == t[i]) t[i] = t[i].toUpperCase();
    else if (t[i].toUpperCase() == t[i]) t[i] = t[i].toLowerCase();
  }
  return t.join("")
}
```

## Java
```java
public class StringUtils {
  public static String toAlternativeString(String string) {
    String[] s = string.split("");
    for (int i=0;i<s.length;i++) {
      if (s[i].toLowerCase().equals(s[i])) {
        s[i] = s[i].toUpperCase();
      }
      else if (s[i].toUpperCase().equals(s[i])) {
        s[i] = s[i].toLowerCase();
      }
    }
    return String.join("", s);
  }
}
```

## TypeScript
```ts
export function toAlternatingCase(s: string): string {
  let t = s.split("");
  for (let i=0;i<t.length;i++) {
    if (t[i].toLowerCase() == t[i]) t[i] = t[i].toUpperCase();
    else if (t[i].toUpperCase() == t[i]) t[i] = t[i].toLowerCase();
  }
  return t.join("")
}
```