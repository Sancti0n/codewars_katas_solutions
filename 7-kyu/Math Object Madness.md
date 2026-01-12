https://www.codewars.com/kata/56bc0fc65bdaeb46d800084a

## JavaScript
```js
Math.ceil = function(x) {
  if (x%1) return parseInt(x)+1
  else return x
}

Math.floor = function(x) {
  return parseInt(x)
}

Math.round = function(x) {
  if (x%1>=.5) return parseInt(x)+1
  else return parseInt(x)
}

Math.abs = function(x) {
  if (x<=0) return -x
  else return x
}

Math.max = function() {
  let m = arguments[0];
  for (let i=1;i<arguments.length;i++) {
    if (m<arguments[i]) m = arguments[i];
  }
  return m
}

Math.min = function() {
  let m = arguments[0];
  for (let i=1;i<arguments.length;i++) {
    if (m>arguments[i]) m = arguments[i];
  }
  return m
}

Math.pow = function(x, y) {
  return x**y
}
```