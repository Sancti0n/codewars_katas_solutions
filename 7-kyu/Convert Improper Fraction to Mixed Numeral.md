https://www.codewars.com/kata/574e4175ff5b0a554a00000b

## JavaScript
```js
function convertToMixedNumeral(parm) {
  let t = [parseInt(parm.split("/")[0]), parseInt(parm.split("/")[1])]
  if (Math.abs(t[0])<t[1]) return parm
  if (t[0]%t[1] == 0) return parseInt(t[0]/t[1]).toString()
  return parseInt(t[0]/t[1]).toString() + " " + Math.abs(t[0]%t[1]).toString() + "/" + t[1].toString()
}
```

## Python
```python
def convert_to_mixed_numeral(parm):
    t = [int(parm.split("/")[0]), int(parm.split("/")[1])]
    if abs(t[0])<t[1]: return parm
    if (t[0]%t[1]) == 0: return str(int(t[0]/t[1]))
    return str(int(t[0]/t[1])) + " " + str(abs(t[0])%t[1]) + "/" + str(t[1])
```