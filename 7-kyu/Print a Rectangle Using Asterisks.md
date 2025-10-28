https://www.codewars.com/kata/5937ae46377144bb2f000029

## JavaScript
```js
function getRectangleString(width, height) {
  let s = "";
  for (let i=0;i<height;i++) {
    if (i==0 || i==height-1) s += "*".repeat(width)+"\r\n";
    else s += "*"+" ".repeat(width-2)+"*\r\n";
  }
  return s
}
```