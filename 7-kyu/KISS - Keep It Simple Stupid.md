https://www.codewars.com/kata/57eeb8cc5f79f6465a0015c1

## Python
```py
def is_kiss(words):
    l = words.split(" ")
    for i in l:
        if len(i)>len(l): return "Keep It Simple Stupid"
    return "Good work Joe!"
```

## JavaScript
```js
function isKiss(words) {
  let l = words.split(" ");
  for (let i=0;i<l.length;i++) {
    if (l[i].length>l.length) return "Keep It Simple Stupid"
  }
  return "Good work Joe!"
}
```