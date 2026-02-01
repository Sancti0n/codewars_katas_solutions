https://www.codewars.com/kata/56b12e3ad2387de332000041

## Python
```py
def diff(arr):
    value, s = [0, ""]
    for i in arr:
        v = abs(int(i.split("-")[0])-int(i.split("-")[1]))
        if value<v:
            value = v
            s = i
    return s if len(s)>0 else False
```

## JavaScript
```js
function diff(str) {
  let value = 0, s = "", v = 0;
  for (let i=0;i<str.length;i++) {
    v = Math.abs(parseInt(str[i].split("-")[0]) - parseInt(str[i].split("-")[1]));
    if (value<v) {
      value = v;
      s = str[i];
    }
  }
  return s.length>0 ? s : false
}
```