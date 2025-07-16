https://www.codewars.com/kata/57a60bad72292d3e93000a5a

## Python
```python
def to_acronym(inp):
    w = ""
    inp = inp.split(" ")
    for i in inp:
        w += i[0].upper()
    return w
```

## JavaScript
```js
function toAcronym(inp){
  let w = "";
  inp = inp.split(" ");
  for (let i=0;i<inp.length;i++) w += inp[i][0].toUpperCase();
  return w
}
```