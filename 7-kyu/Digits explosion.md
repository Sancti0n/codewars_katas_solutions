https://www.codewars.com/kata/585b1fafe08bae9988000314

## JavaScript
```js
function explode(s) {
  let w = "";
  for (let i=0;i<s.length;i++) {
    w += s[i].repeat(parseInt(s[i]));
  }
  return w
}
```

## Python
```python
def explode(s):
    w = ''
    for i in range(len(s)):
        w += s[i]*int(s[i])
    return w
```

## PHP
```php
function digits_explode(string $s): string {
  $w = '';
  for ($i=0;$i<strlen($s);$i++) {
    $w .= str_repeat($s[$i], intval($s[$i]));
  }
  return $w;
}
```

## Java
```java
public class Solution {
  public static String explode(String digits) {
    String w = "";
    for (int i=0;i<digits.length();i++) {
      w += String.valueOf(digits.charAt(i)).repeat(Character.getNumericValue(digits.charAt(i)));
    }
    return w;
  }
}
```

## TypeScript
```ts
export function explode(s: string): string {
  let w = "";
  for (let i=0;i<s.length;i++) {
    w += s[i].repeat(parseInt(s[i]));
  }
  return w
}
```