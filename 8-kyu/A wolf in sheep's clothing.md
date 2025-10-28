https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15

## Python
```python
def warn_the_sheep(queue):
    if queue.index("wolf") == len(queue)-1: return "Pls go away and stop eating my sheep"
    return "Oi! Sheep number "+str(len(queue)-queue.index("wolf")-1)+"! You are about to be eaten by a wolf!"
```

## JavaScript
```js
function warnTheSheep(queue) {
  if (queue.indexOf("wolf") == queue.length-1) return "Pls go away and stop eating my sheep"
  return "Oi! Sheep number "+(queue.length-queue.indexOf("wolf")-1).toString()+"! You are about to be eaten by a wolf!"
}
```

## Java
```java
public class ZywOo {
  public static String warnTheSheep(String[] queue) {
    int p = 0;
    for (int i=0;i<queue.length;i++) {
      if (queue[i] == "wolf") p = i;
    }
    if (p == queue.length-1) return "Pls go away and stop eating my sheep";
    return "Oi! Sheep number "+(queue.length-p-1)+"! You are about to be eaten by a wolf!";
  }
}
```