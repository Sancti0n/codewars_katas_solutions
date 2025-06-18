https://www.codewars.com/kata/56541980fa08ab47a0000040

## JavaScript
```js
function printerError(s) {
  let c = 0;
  for (let i=0;i<s.length;i++) {
    if (s[i].charCodeAt(0)>109) c++;
  }
  return c + "/" + s.length
}
```

## Python
```python
def printer_error(s):
    a = ['n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    s = sorted(s)
    l = len(s)
    for i in range(len(a)):
        if a[i] in s:
            x = "".join(s).split(a[i])
            return str(len(x[len(x)-1])+s.count(a[i]))+'/'+str(l)
        if 'm' in s:
            x = "".join(s).split("m")
            return str(len(x[len(x)-1]))+'/'+str(l)
```

## PHP
```php
function printerError($s) {
  $c = 0;
  for ($i=0;$i<strlen($s);$i++) {
    if (ord($s[$i])>109) $c++;
  }
  return $c."/".strlen($s);
}
```

## Java
```java
public class Printer {
  public static String printerError(String s) {
    int c = 0;
    for (int i=0;i<s.length();i++) {
      if ((int) s.charAt(i)>109) c++;
    }
    return String.valueOf(c) + "/" + String.valueOf(s.length());
  }
}
```