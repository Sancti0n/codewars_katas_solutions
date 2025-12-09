https://www.codewars.com/kata/55b42574ff091733d900002f

## Python
```py
def friend(x):
    return [f for f in x if len(f) == 4]
```

## JavaScript
```js
function friend(friends){
  let t = [];
  for (let i=0;i<friends.length;i++) {
    if (friends[i].length === 4) t.push(friends[i]);
  }
  return t
}
```