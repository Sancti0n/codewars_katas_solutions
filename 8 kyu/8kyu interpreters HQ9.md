https://www.codewars.com/kata/591588d49f4056e13f000001

## JavaScript
```js
function HQ9(code) {
  if (code == 'H') return 'Hello World!'
  if (code == 'Q') return 'Q'
  if (code == '9') {
    let s = "";
    for (let i=99;i>1;i--) {
      if (i-1 == 1) s += `${i} bottles of beer on the wall, ${i} bottles of beer.\nTake one down and pass it around, ${i-1} bottle of beer on the wall.\n`
      else s += `${i} bottles of beer on the wall, ${i} bottles of beer.\nTake one down and pass it around, ${i-1} bottles of beer on the wall.\n`
    }
    s += "1 bottle of beer on the wall, 1 bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall.\nNo more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."
    return s
  }
}
```

## Python
```python
def HQ9(code):
    if code == 'H': return 'Hello World!'
    if code == 'Q': return 'Q'
    if code == '9':
        s = ""
        a = " bottles of beer on the wall"
        b = " of beer.\nTake one down and pass it around, "
        for i in range(99, 1, -1):
            if i-1 == 1: s += f"{i}" + a + f", {i} bottles"+ b +f"{i-1} bottle of beer on the wall.\n"
            else: s += f"{i}" + a + f", {i} bottles" + b + f"{i-1}" + a + ".\n"
        s += "1 bottle of beer on the wall, 1 bottle" + b + "no more" + a + ".\nNo more" + a + ", no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."
        return s
```