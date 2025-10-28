https://www.codewars.com/kata/5889177bf148eddd150002cc

## Python
```py
def tiy_fizz_buzz(s):
    t = ['a', 'e', 'i', 'o', 'u']
    v = ""
    for i in s:
        if i.isupper():
            if i.lower() in t: v += "Iron Yard"
            else: v += "Iron"
        else:
            if i.lower() in t: v += "Yard"
            else: v += i
    return v
```

## JavaScript
```js
function tiyFizzBuzz(s) {
  let t = ['a', 'e', 'i', 'o', 'u'], v = "";
  for (let i=0;i<s.length;i++) {
    if (s[i].toUpperCase() == s[i] && s[i].toUpperCase() != s[i].toLowerCase()) {
      if (t.indexOf(s[i].toLowerCase())>-1) v += "Iron Yard";
      else v += "Iron";
    }
    else {
      if (t.indexOf(s[i].toLowerCase())>-1) v += "Yard";
      else v += s[i];
    }
  }
  return v
}
```