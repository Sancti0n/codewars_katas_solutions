https://www.codewars.com/kata/5900750cb7c6172207000054

## Python
```py
def sticky_calc(op, v1, v2):
    v = int(str(round(v1))+str(round(v2)))
    if op == '+': return round(v+round(v2))
    if op == '-': return round(v-round(v2))
    if op == '*': return round(v*round(v2))
    if op == '/': return round(v/round(v2))
```

## JavaScript
```js
function stickyCalc (op, v1, v2){
    let v = Number(Math.round(v1)+Math.round(v2).toString())
    return Math.round(eval(v+op+v2))
}
```