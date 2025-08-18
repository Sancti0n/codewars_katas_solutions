https://www.codewars.com/kata/56b1f01c247c01db92000076

## TypeScript
```ts
export function doubleChar(str: string): string{
  let w = '';
  for (let i=0;i<str.length;i++) w += str[i]+str[i];
  return w;
}
```

## Python
```python
def double_char(s):
    w = ''
    for i in s:
        w += i+i
    return w
```

## Java
```java
public class Solution{
  
  public static String doubleChar(String s){
    String w = "";
    String a[] = s.split("");
    for (int i=0;i<a.length;i++) {
      w += a[i]+a[i];
    }
    return w;
  }
}
```

## JavaScript
```js
function doubleChar(str) {
  let w = '';
  for (let i=0;i<str.length;i++) w += str[i]+str[i];
  return w;
}
```