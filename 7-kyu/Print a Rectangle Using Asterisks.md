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

## Python
```py
def get_rectangle_string(width, height):
    s = ""
    for i in range(height):
        if i==0 or i==height-1: s += "*"*width + "\r\n"
        else: s += "*" + " "*(width-2) + "*\r\n"
    return s
```