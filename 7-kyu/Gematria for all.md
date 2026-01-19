https://www.codewars.com/kata/573c91c5eaffa3bd350000b0

## JavaScript
```js
function gematria(str) {
  let d = {
    "a":1, "b":2, "c":3, "d":4,
    "e":5, "f":6, "g":7, "h":8, 
    "i":9, "k":10, "l":20, "m":30, 
    "n":40, "o":50, "p":60, "q":70, 
    "r":80, "s":90, "t":100, "u":200, 
    "x":300, "y":400, "z":500,"j":600,
    "v":700, "w":900
  };
  let s = 0;
  for (let i=0;i<str.length;i++) {
    if (str[i].toLowerCase() in d) {
      s += d[str[i].toLowerCase()];
    }
  }
  return s
}
```

## Python
```py
def gematria(string):
    st = string.lower()
    s = 0
    d = {
        "a":1, "b":2, "c":3, "d":4,
        "e":5, "f":6, "g":7, "h":8, 
        "i":9, "k":10, "l":20, "m":30, 
        "n":40, "o":50, "p":60, "q":70, 
        "r":80, "s":90, "t":100, "u":200, 
        "x":300, "y":400, "z":500,"j":600,
        "v":700, "w":900
    }
    for i in st:
        if i in d:
            s += d[i]
    return s
```