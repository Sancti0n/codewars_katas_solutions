https://www.codewars.com/kata/54da539698b8a2ad76000228

## Python
```python
def is_valid_walk(walk):
    if len(walk)!=10: return False
    t = [0,0]
    for i in range(len(walk)):
        if walk[i]=="n": t[0] += 1
        elif walk[i]=="s": t[0] -= 1
        elif walk[i]=="w": t[1] += 1
        elif walk[i]=="e": t[1] -= 1
    return t[0] == 0 and t[1] == 0
```

## JavaScript
```js
function isValidWalk(walk) {
  if (walk.length!=10) return false
  let t = [0,0];
  for (let i=0;i<walk.length;i++) {
    if (walk[i]=="n") t[0]++;
    else if (walk[i]=="s") t[0]--;
    else if (walk[i]=="w") t[1]++;
    else if (walk[i]=="e") t[1]--;
  }
  return t[0] == 0 && t[1] == 0
}
```

## Java
```java
public class TenMinWalk {
  public static boolean isValid(char[] walk) {
    if (walk.length != 10) return false;
    int x = 0;
    int y = 0;
    for (int i=0;i<walk.length;i++) {
      if (walk[i] == 'n') x++;
      else if (walk[i] == 's') x--;
      else if (walk[i] == 'w') y++;
      else if (walk[i] == 'e') y--;
    }
    return x == 0 && y == 0;
  }
}
```