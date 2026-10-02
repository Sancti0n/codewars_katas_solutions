https://www.codewars.com/kata/5bbd279c8f8bbd5ee500000f

## JavaScript
```js
function findScreenHeight(width, ratio) {
  let t = ratio.split(":");
  return width + "x" + parseInt(t[1])*width/parseInt(t[0]);
}
```

## Python
```py
def find_screen_height(width, ratio):
    t = ratio.split(":")
    return "{:g}x{:g}".format(width, int(int(t[1]) * width / int(t[0])))
```

## Java
```java
class Kata {
  public static String findScreenHeight(int width, String ratio) {
    String[] s = ratio.split(":");
    return "%dx%d".formatted((int) width, (int) (Integer.parseInt(s[1]) * width / Integer.parseInt(s[0])));
  }
}
```