https://www.codewars.com/kata/590ac6b9be4dff49b0000042

## Python
```py
def convert(degrees):
    a = int(degrees)
    b = round((degrees-a)*60, 10)
    b_int = int(b)
    c = round((b-b_int)*60)
    
    if c == 60:
        c = 0
        b_int += 1
    if b_int == 60:
        b_int = 0
        a += 1
    
    t = [a, b_int, c]

    while len(t) > 1 and t[-1] == 0:
        t.pop()

    return t
```

## JavaScript
```js
function convert(degrees) {
  let h = Math.round(degrees*3600);
  let d = Math.floor(h/3600), m = Math.floor((h%3600)/60), s = h%60;
  return s ? [d, m, s] : m ? [d, m] : [d]
}
```