https://www.codewars.com/kata/57eae65a4321032ce000002d

## JavaScript
```js
function fakeBin(x) {
    return x.split('').map(n => n < 5 ? 0 : 1).join('');
}
```

## Python
```python
def fake_bin(x):
    x = list(x)
    for i in range(len(x)):
        if int(x[i]) >= 5: x[i] = "1"
        else: x[i] = "0"
    return "".join(x)
```

## PHP
```php
function fake_bin(string $s): string {
  $w = "";
  for ($i=0;$i<strlen($s);$i++) {
    if (intval($s[$i]<5)) $w .= "0";
    else $w .= "1";
  }
  return $w;
}
```

## Java
```java
public class FakeBinary {
  public static String fakeBin(String n) {
    String w = "";
    String[] s = n.split("");
    for (int i=0;i<s.length;i++) {
      if (Integer.parseInt(s[i])<5) w += '0';
      else w += '1';
    }
    return w;
  }
}
```