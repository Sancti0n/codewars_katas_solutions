https://www.codewars.com/kata/59bd84b8a0640e7c49002398

## Python
```python
def t_area(t_str):
    h = t_str.count("\n") - 2
    l = len(t_str.split("\n"))
    b = t_str.split("\n")[l-2].count(".")-1
    return h*b/2
```

## JavaScript
```js
function tArea(tStr) {
  let h = (tStr.match(new RegExp("\n", "g")) || []).length - 2;
  let l = tStr.split("\n").length;
  let b = ((tStr.split("\n")[l-2]).match(new RegExp(" ", "g")) || []).length;
  return h*b/2
}
```