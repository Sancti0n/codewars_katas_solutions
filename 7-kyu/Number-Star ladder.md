https://www.codewars.com/kata/5631213916d70a0979000066

## JavaScript
```js
function pattern(n){
  var output="";
  for (let i=1;i<=n;i++) {
    if (i===1) output += '1\n';
    else if (i===n) output += '1'+'*'.repeat(i-1)+i;
    else output += '1'+'*'.repeat(i-1)+i+'\n';
  }
  return output;
}
```

## Python
```py
def pattern(n):
    w = ""
    for i in range(1,n+1):
        if i==1: w += '1\n'
        elif i==n: w += '1'+'*'*(i-1)+str(i)
        else: w += '1'+'*'*(i-1)+str(i)+'\n'
    return w
```

## Java
```java
public class Kata {
    public static String pattern(int n){
      String w = "";
      if (n==1) return "1";
      for (int i=1;i<=n;i++) {
        if (i==1) w += "1\n";
        else if (i==n) w += "1"+"*".repeat(i-1)+i;
        else w += "1"+"*".repeat(i-1)+i+"\n";
      }
      return w;
    }
}
```