https://www.codewars.com/kata/5734c38da41454b7f700106e

## Python
```py
def only_one(*arg):
    return arg.count(True)==1
```

## JavaScript
```js
function onlyOne(...a) {
  let c = 0;
  for (let i=0;i<a.length;i++) {
    if (a[i] == true) c++;
    if (c>1) return false
  }
  return c>0 ? true: false
}
```

## Java
```java
public class OnlyOne {
	public static boolean onlyOne(Boolean... args) {
    int c = 0;
    for (int i=0;i<args.length;i++) {
      if (args[i] == true) c++;
      if (c>1) return false;
    }
    return c>0 ? true: false;
	}
}
```