https://www.codewars.com/kata/571af500196bb01cc70014fa

## Python
```py
import string

def loopStr(c, s) :
    st = ""
    for i in c:
        if i in s:
            st += s[(len(s)-s.index(i)-1)%len(s)]
        else:
            st += i
    return st

def mirror(*arg):
    code = arg[0].lower()
    t = list(string.ascii_lowercase)
    if len(arg)>1:
        return loopStr(code, arg[1])
    else:
        return loopStr(code, t)
```

## JavaScript
```js
function loopStr(c, s) {
  let st = "";
  for (let i=0;i<c.length;i++) {
    if (s.indexOf(c[i]) > -1) {
      st += s[(s.length - s.indexOf(c[i]) - 1) % s.length];
    }
    else {
      st += c[i];
    }
  }
  return st;
}

function mirror(...arg) {
  const code = arg[0].toLowerCase();
  const t = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  if (arg.length > 1) {
    return loopStr(code, arg[1]);
  }
  else {
    return loopStr(code, t);
  }
}
```