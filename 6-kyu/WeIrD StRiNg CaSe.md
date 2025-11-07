https://www.codewars.com/kata/52b757663a95b11b3d00062d

## Python
```py
def to_weird_case(string):
    w = ''
    s = string.split(' ')
    for i in range(len(s)):
        for j in range(len(s[i])):
            if j%2 == 0: w += s[i][j].upper()
            else: w += s[i][j]
        w += ' '
    return w[:-1]
```

## JavaScript
```js
function toWeirdCase(string) {
  let st = "", s = string.split(" ");
  for (let i=0;i<s.length;i++) {
    for (let j=0;j<s[i].length;j++) {
      if (j%2 < 1) st += s[i][j].toUpperCase();
      else st += s[i][j].toLowerCase();
    }
    st += " ";
  }
  return st.substring(0, st.length-1)
}
```