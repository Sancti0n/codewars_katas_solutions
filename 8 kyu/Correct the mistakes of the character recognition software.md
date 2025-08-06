https://www.codewars.com/kata/577bd026df78c19bca0002c0

## Java
```java
public class Correct {
  public static String correct(String string) {
    String[] t = string.split("");
    String l = "";
    for (int i=0;i<t.length;i++) {
      if (t[i].equals("5")) l += "S";
      else if (t[i].equals("0")) l += "O";
      else if (t[i].equals("1")) l += "I";
      else l += t[i];
    }
    return l;
  }
}
```

## JavaScript
```js
function correct(string) {
  return string.replace(/0/g, 'O').replace(/5/g, 'S').replace(/1/g, 'I')
}
```

## Python
```python
def correct(s):
    return s.replace("0", "O").replace("5", "S").replace("1", "I")
```

## PHP
```php
function correct($s) {
  $t = ["0", "1", "5"];
  $u = ["O", "I", "S"];
  for ($i=0;$i<strlen($s);$i++) {
    $s = str_replace($t[$i], $u[$i], $s);
  }
  return $s;
}
```

## TypeScript
```ts
export function correct(s: string): string{
  return s.replace(/0/g, 'O').replace(/5/g, 'S').replace(/1/g, 'I')
}
```