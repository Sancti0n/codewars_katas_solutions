https://www.codewars.com/kata/525c65e51bf619685c000059

## JavaScript
```js
function cakes(recipe, available) {
  let c = Math.max(...Object.values(available));
  for (const p in recipe) {
    if (Object.keys(available).indexOf(p)<0) return 0
    else {
      if (c > parseInt(available[p]/recipe[p])) c = parseInt(available[p]/recipe[p]);
    }
  }
  return c
}
```

## Python
```python
def cakes(recipe, available):
    if len(available)<1: return 0
    c = available.get(max(available, key=available.get))
    for i in recipe:
        if i not in available: return 0
        elif c > int(available[i]/recipe[i]): c = int(available[i]/recipe[i])
    return c
```