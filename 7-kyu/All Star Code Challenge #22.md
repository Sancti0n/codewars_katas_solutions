https://www.codewars.com/kata/5865cff66b5699883f0001aa

## Python
```py
def to_time(seconds):
    h = int(seconds/3600)
    seconds = seconds-h*3600 if seconds>=3600 else seconds
    m = int(seconds/60)
    return f"{h} hour(s) and {m} minute(s)"
```

## JavaScript
```js
function toTime(seconds) {
  return `${parseInt(seconds/3600)} hour(s) and ${parseInt(seconds/60)%60} minute(s)`
}
```

## Java
```java
public class timeConverter{
  public static String toTime(int seconds) {
    int h = seconds/3600;
    int m = (seconds/60)%60;
    return "%s hour(s) and %s minute(s)".formatted(h, m);
  }
}
```