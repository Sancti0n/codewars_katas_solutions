https://www.codewars.com/kata/56541980fa08ab47a0000040

## JavaScript
```js
function printerError(s) {
  let c = 0;
  for (let i=0;i<s.length;i++) {
    if (s[i].charCodeAt(0)>109) c++;
  }
  return c + "/" + s.length
}
```

## Python
```python
def printer_error(s):
    a = ['n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    s = sorted(s)
    l = len(s)
    for i in range(len(a)):
        if a[i] in s:
            x = "".join(s).split(a[i])
            return str(len(x[len(x)-1])+s.count(a[i]))+'/'+str(l)
        if 'm' in s:
            x = "".join(s).split("m")
            return str(len(x[len(x)-1]))+'/'+str(l)
```