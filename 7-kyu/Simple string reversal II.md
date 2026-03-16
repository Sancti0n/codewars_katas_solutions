https://www.codewars.com/kata/5a8d1c82373c2e099d0000ac

## Python
```python
def solve(st,a,b):
    return st[:a]+st[a:b+1][::-1]+st[b+1:]
```

## JavaScript
```js
function solve(st,a,b) {
  return st.substring(0,a)+st.substring(a,b+1).split("").reverse().join("")+st.substring(b+1)
}
```

## PHP
```php
function solve(string $str, int $a, int $b): string {
  return substr($str, 0, $a) . strrev(substr($str, $a, $b-$a+1)) . substr($str, $b+1);
}
```

## Java
```java
class Solution{
  public static String solve(String s, int a, int b) {
    String st = "";
    for (int i=0;i<a;i++) {
      st += s.charAt(i);
    }
    b = Math.min(b, s.length()-1);
    for (int j=b;j>=a;j--) {
      st += s.charAt(j);
    }
    for (int k=b+1;k<s.length();k++) {
      st += s.charAt(k);
    }
    return st;
  }
}
```