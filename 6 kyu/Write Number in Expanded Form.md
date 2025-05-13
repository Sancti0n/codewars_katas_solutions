https://www.codewars.com/kata/5842df8ccbd22792a4000245

## JavaScript
```js
function expandedForm(num) {
  let s = num.toString().length;
  let i = 0;
  let r = "";
  let v = 0;
  while (i<s) {
    v = parseInt(num.toString().substring(num.toString().length-1-i, num.toString().length));
    num -= v;
    if (v != 0) {
      if (r == "") r = v.toString();
      else r = v.toString() + " + " + r;
    }
    i++;
  }
  return r
}
```

## Python
```python
def expanded_form(num):
    s = len(str(num))
    i = 0
    r = ""
    while i<s:
        v = int(str(num)[-1-i:])
        num -= v
        if v != 0: 
            if r == "": r = str(v)
            else: r = str(v) + " + " + r
        i += 1
    return r
```