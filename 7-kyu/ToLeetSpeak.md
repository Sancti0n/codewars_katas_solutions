https://www.codewars.com/kata/57c1ab3949324c321600013f

## Python
```python
def to_leet_speak(str):
    d = { 'A' : '@', 'B' : '8', 'C' : '(', 'D' : 'D', 'E' : '3', 'F' : 'F', 'G' : '6', 'H' : '#', 'I' : '!', 'J' : 'J', 'K' : 'K', 'L' : '1', 'M' : 'M',
         'N' : 'N', 'O' : '0', 'P' : 'P', 'Q' : 'Q', 'R' : 'R', 'S' : '$', 'T' : '7', 'U' : 'U', 'V' : 'V', 'W' : 'W', 'X' : 'X', 'Y' : 'Y', 'Z' : '2'}
    w = ""
    for i in str: 
        if i in d: w += d[i]
        else: w += i
    return w
```

## JavaScript
```js
function toLeetSpeak(str) {
  let d = {'A' : '@', 'B' : '8', 'C' : '(', 'D' : 'D', 'E' : '3', 'F' : 'F', 'G' : '6', 'H' : '#', 'I' : '!', 'J' : 'J', 'K' : 'K', 'L' : '1', 'M' : 'M',
         'N' : 'N', 'O' : '0', 'P' : 'P', 'Q' : 'Q', 'R' : 'R', 'S' : '$', 'T' : '7', 'U' : 'U', 'V' : 'V', 'W' : 'W', 'X' : 'X', 'Y' : 'Y', 'Z' : '2'};
  let w = "";
  for (let i=0;i<str.length;i++) {
    if (d[str[i]] != undefined) w += d[str[i]];
    else w += str[i];
  }
  return w
}
```