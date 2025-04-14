https://www.codewars.com/kata/592915cc1fad49252f000006

## JavaScript
```js
function noIfsNoButs(a, b) {
  switch (a==b) {
    case true: return a.toString()+" is equal to "+b.toString()
    case false:
      switch (a>b) {
        case true: return a.toString()+" is greater than "+b.toString()
        case false: return a.toString()+" is smaller than "+b.toString()
          break;
      }
    break;
  }
}
```

## Python
```python
def no_ifs_no_buts(a, b):
    match a==b:
        case True: return str(a)+" is equal to "+str(b)
    match a>b:
        case True: return str(a)+" is greater than "+str(b)
        case False: return str(a)+" is smaller than "+str(b)
```

## Java
```java
public class NoIfsNoButs {
  public static String noIfsNoButs(int a, int b) {
    int signum = Long.signum((long)a - b);
    switch(signum) {
      case 0:
        return String.valueOf(a) + " is equal to " + String.valueOf(b);
      case 1:
        return String.valueOf(a) + " is greater than " + String.valueOf(b);
      case -1:
        return String.valueOf(a) + " is smaller than " + String.valueOf(b);
    }
    return "";
  }
}
```