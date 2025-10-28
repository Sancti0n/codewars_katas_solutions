https://www.codewars.com/kata/5d62961d18198b000e2f22b3/train/python

## Python
```python
def generate_number(squad, n):
    if n not in squad: return n
    v = 1
    while n != sum(list(map(int, str(v)))) or v in squad:
        v += 1
        if v>99: return None
    return None if v%10 == 0 else v
```

## JavaScript
```js
function sumArr(a) {
  return a.reduce((p, c) => p + c, 0)
}

function generateNumber(squad, n){
  if (squad.indexOf(n)<0) return n
  let v = 1;
  while (n != sumArr(Array.from(String(v), Number)) || squad.indexOf(v)>-1) {
    v++;
    if (v>99) return null
  }
  return v%10 ? v : null
}
```