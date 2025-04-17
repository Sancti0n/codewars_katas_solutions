https://www.codewars.com/kata/55b1fd84a24ad00b32000075

## JavaScript
```js
var AmIAfraid = function(day, num){
  if (day=="Monday") return num == 12
  if (day=="Tuesday") return num>95
  if (day=="Wednesday") return num==34
  if (day=="Thursday") return num==0
  if (day=="Friday") return num%2==0
  if (day=="Saturday") return num==56
  if (day=="Sunday") return Math.abs(num)==666
}
```

## Python
```python
def am_I_afraid(day,num):
    if day=="Monday": return num == 12
    if day=="Tuesday": return num>95
    if day=="Wednesday": return num==34
    if day=="Thursday": return num==0
    if day=="Friday": return num%2==0
    if day=="Saturday": return num==56
    if day=="Sunday": return abs(num)==666
```

## Java
```java
public class Arithmophobia {
  static public boolean AmIAfraid(final String day, final int num) {
    if (day=="Monday") return num == 12;
    if (day=="Tuesday") return num>95;
    if (day=="Wednesday") return num==34;
    if (day=="Thursday") return num==0;
    if (day=="Friday") return num%2==0;
    if (day=="Saturday") return num==56;
    return Math.abs(num)==666;
  }
}
```