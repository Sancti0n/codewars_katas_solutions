https://www.codewars.com/kata/5e96332d18ac870032eb735f

## Python
```python
def womens_age(n):
    d, b = ["", 2]
    while d not in ["20","21"]:
        d, nb = ["", n]
        while nb>0:
            d += str(nb % b)
            nb //= b
        d = d[::-1]
        b += 1
    return f"{n}? That's just {d}, in base {b-1}!"
```

## JavaScript
```js
function womensAge(n) {
  return `${n}? That's just 2${n%2}, in base ${~~(n/2)}!`
}
```

## Java
```java
public class Kata {
  public static String womensAge(int n) {
    return String.format("%s? That's just 2%s, in base %s!", n, n%2, n/2);  
  }
}
```