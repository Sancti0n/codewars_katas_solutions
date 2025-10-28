https://www.codewars.com/kata/57f7b8271e3d9283300000b4

## Python
```python
def even_or_odd(s):
    o = 0
    e = 0
    for i in range(len(s)):
        if int(s[i])%2 == 0: e += int(s[i])
        else: o += int(s[i])
    if e>o: return 'Even is greater than Odd'
    if e<o: return 'Odd is greater than Even'
    else: return 'Even and Odd are the same'
```

## JavaScript
```js
function evenOrOdd(s) {
  let o = 0
  let e = 0
  for (let i=0;i<s.length;i++) {
    if (Number(s[i])%2 == 0) e += Number(s[i])
    else o += Number(s[i])
  }
  if (e>o) return 'Even is greater than Odd'
  if(e<o) return 'Odd is greater than Even'
  else return 'Even and Odd are the same'
}
```

## Java
```java
public class Kata{
  public static String evenOrOdd(String str) {
    int o = 0;
    int e = 0;
    for (int i=0;i<str.length();i++) {
      if (Integer.valueOf(str.charAt(i))%2 == 1) o += str.charAt(i) - '0';
      else e += str.charAt(i) - '0';
    }
    return e>o ? "Even is greater than Odd": e<o ? "Odd is greater than Even": "Even and Odd are the same";
  }
}
```