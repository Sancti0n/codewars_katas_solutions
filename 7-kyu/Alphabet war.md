https://www.codewars.com/kata/59377c53e66267c8f6000027

## JavaScript
```js
function alphabetWar(fight) {
  let a = {"w":4,"p":3,"b":2,"s":1,"m":-4,"q":-3,"d":-2,"z":-1};
  let c = 0;
  for (let i=0;i<fight.length;i++) {
    if (Object.keys(a).indexOf(fight[i])>-1) c += a[fight[i]];
  }
  if (c>0) return "Left side wins!"
  if (c<0) return "Right side wins!"
  return "Let's fight again!"
}
```

## Python
```python
def alphabet_war(fight):
    a = {"w":4,"p":3,"b":2,"s":1}
    b = {"m":4,"q":3,"d":2,"z":1}
    c, d = [0,0]
    for i in fight:
        if i in a: c += a[i]
        if i in b: d += b[i]
    if c>d: return "Left side wins!"
    if c<d: return "Right side wins!"
    return "Let's fight again!"
```