https://www.codewars.com/kata/5f5802bf4c2cc4001a6f859e

## JavaScript
```js
function gridIndex(grid, indices) {
  let t = grid.flat(), s = "";
  for (let i=0;i<indices.length;i++) {
    s += t[indices[i]-1];
  }
  return s
}
```

## Python
```py
def grid_index(grid, indexes):
    t = [b for a in grid for b in a]
    return "".join([t[indexes[i]-1] for i in range(len(indexes))])
```