https://www.codewars.com/kata/65127141a5de2b1dcb40927e

## JavaScript
```js
function spinAround(turns) {
  let r = 0, l = 0;
  for (let i=0;i<turns.length;i++) {
    if (turns[i] == "right") {
      r += 1;
    }
    if (turns[i] == "left") {
      l += 1;
    }
  }
  return Math.floor(Math.abs(r-l)/4);
}
```

## Python
```py
def spin_around(lst):
    return abs(lst.count("right") - lst.count("left")) // 4
```