https://www.codewars.com/kata/564ab935de55a747d7000040

## Python
```py
def remove(text, what):
    s = ""
    for i in text:
        if i in what and what[i]>0:
            what[i] -= 1
        else:
            s += i
    return s
```

## JavaScript
```js
function remove(str, what) {
  let s = "";
  for (let i=0;i<str.length;i++) {
    if (Object.hasOwn(what, str[i]) && what[str[i]]>0) {
      what[str[i]]--;
    }
    else {
      s += str[i];
    }
  }
  return s
}
```