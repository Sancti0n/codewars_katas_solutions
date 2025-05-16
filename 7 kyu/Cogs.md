https://www.codewars.com/kata/59e1b9ce7997cbecb9000014

## JavaScript
```js
function cogRpm(cogs) {
  let v = 1;
  for (let i=1;i<cogs.length;i++) {
    if (cogs[i] != cogs[i-1]) {
      v *= cogs[i-1]/cogs[i];
    }
  }
  return v*(-1)**(cogs.length-1);
}
```

## Python
```python
def cog_RPM(cogs):
    v = 1
    for i in range(1,len(cogs)):
        if cogs[i-1] != cogs[i]:
            v *= cogs[i-1]/cogs[i]
    return v*(-1)**(len(cogs)-1)
```

## Java
```java
public class Dinglemouse {
  public static double cogRpm(final int[] cogs) {
    double v = 1;
    for (int i=1;i<cogs.length;i++) {
      if (cogs[i-1] != cogs[i]) {
        v *= (double) cogs[i-1]/cogs[i];
      }
    }
    return v*Math.pow(-1,cogs.length-1);
  }
}
```