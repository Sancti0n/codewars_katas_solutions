https://www.codewars.com/kata/6071ef9cbe6ec400228d9531

## Python
```python
def calculator(txt):
    if "+" in txt: return txt[0]*(len(txt)-3)
    if "-" in txt:
        t = txt.split(" - ")
        return txt[0]*(abs(len(t[0])-len(t[1])))
    if "*" in txt:
        t = txt.split(" * ")
        return txt[0]*(len(t[0])*len(t[1]))
    if "//" in txt:
        t = txt.split(" // ")
        return txt[0]*(len(t[0])//len(t[1]))
```

## JavaScript
```js
function dotCalculator (e) {
	if (e.indexOf("+")>-1) return e[0].repeat(e.length-3)
  if (e.indexOf("-")>-1) {
    t = e.split(" - ");
    return e[0].repeat(Math.abs(t[0].length-t[1].length))
  }
  if (e.indexOf("*")>-1) {
    t = e.split(" * ");
    return e[0].repeat(t[0].length*t[1].length)
  }
  if (e.indexOf("//")>-1) {
    t = e.split(" // ");
    return e[0].repeat(t[0].length/t[1].length)
  } 
}
```