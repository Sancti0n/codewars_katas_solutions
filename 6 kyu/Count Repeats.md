https://www.codewars.com/kata/598ee7b6ec6cb90dd6000061

## Python
```python
def count_repeats(txt):
    s = ""
    for i in range(len(txt)):
        if i == 0: s += txt[i]
        else:
            if txt[i-1] != txt[i]: s += txt[i]
    return len(txt)-len(s)
```

## JavaScript
```js
function countRepeats(str) {
  let s = str[0];
  for (let i=1;i<str.length;i++) {
    if (str[i-1] != str[i]) s += str[i];
  }
  return str.length-s.length
}
```