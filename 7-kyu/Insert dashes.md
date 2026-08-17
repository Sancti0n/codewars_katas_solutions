https://www.codewars.com/kata/55960bbb182094bc4800007b

## Python
```py
def insert_dash(num):
    w = ''
    num = str(num)
    for i in range(len(num)):
        if i == 0: w = num[i]
        elif int(num[i])%2 == 1 and int(num[i-1])%2 == 1: w += '-'+num[i]
        else: w += num[i]
    return w
```

## JavaScript
```js
function insertDash(num) {
  let w = '';
  num = num.toString();
  for (let i=0;i<num.length;i++) {
    if (i === 0) w = num[i];
    else if (parseInt(num[i])%2 === 1 && parseInt(num[i-1])%2 === 1) w += '-' + num[i];
    else w += num[i];
  }
  return w
}
```

## Java
```java
public class Solution {
  
  public static String insertDash(int num) {
    String w = "";
    String temp = Integer.toString(num);
    int[] n = new int[temp.length()];
    for (int i=0;i<temp.length();i++) {
      n[i] = temp.charAt(i) - '0';
    }
    for (int i=0;i<n.length;i++) {
      if (i == 0) w = String.valueOf(n[i]);
      else if (n[i]%2 == 1 && n[i-1]%2 == 1) w += "-" + String.valueOf(n[i]);
      else w += String.valueOf(n[i]);
    }
    return w;
  }
}
```