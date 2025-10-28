https://www.codewars.com/kata/5a97387e5ee396e70a00016d

## JavaScript
```js
function pofi(n){
  switch(n%4) {
      case (0): return "1"
      case (1): return "i"
      case (2): return "-1"
      case (3): return "-i"
  }
}
```

## Python
```python
def pofi(n):
    match n%4:
        case 0: return "1"
        case 1: return "i"
        case 2: return "-1"
        case 3: return "-i"
```

## Java
```java
public class Kata {
  public static String pofi(int n) {
    switch(n%4) {
      case 0: return "1";
      case 1: return "i";
      case 2: return "-1";
      case 3: return "-i";
    }
    return "0";
  }
}
```