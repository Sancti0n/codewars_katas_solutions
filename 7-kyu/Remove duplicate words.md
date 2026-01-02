https://www.codewars.com/kata/5b39e3772ae7545f650000fc

## JavaScript
```js
function removeDuplicateWords (s) {
  let t = [];
  s = s.split(" ");
  for (let i=0;i<s.length;i++) {
    if (t.indexOf(s[i])<0) t.push(s[i]);
  }
  return t.join(" ")
}
```

## Python
```py
def remove_duplicate_words(s):
    s = s.split(" ")
    t = []
    for i in s:
        if i not in t: t.append(i)
    return " ".join(t)
```