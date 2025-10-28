https://www.codewars.com/kata/570fd7ad34e6130455001835

## JavaScript
```js
function zebulansNightmare(functionName) {
  let t = functionName.split("");
  for (let i=0;i<t.length;i++) {
    if (t[i] == "_") {
      t[i] = "";
      t[i+1] = t[i+1].toUpperCase();
      i++;
    }
  }
  return t.join("")
}
```

## Python
```python
def zebulans_nightmare(function):
    t = list(function)
    for i in range(len(t)):
        if t[i] == "_":
            t[i] = ""
            t[i+1] = t[i+1].upper()
    return "".join(t)
```