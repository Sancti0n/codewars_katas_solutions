https://www.codewars.com/kata/53af2b8861023f1d88000832

## Python
```python
def are_you_playing_banjo(name):
    if name[0].lower() == 'r': return name+' plays banjo'
    return name+' does not play banjo'
```

## JavaScript
```js
function areYouPlayingBanjo(name) {
  if (name[0].toLowerCase() === "r") return name+' plays banjo'
  return name+' does not play banjo'
}
```

## Java
```java
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    String[] t = name.split("");
    if (t[0].toLowerCase().equals("r")) return name+ " plays banjo";
    return name+" does not play banjo";
  }
}
```