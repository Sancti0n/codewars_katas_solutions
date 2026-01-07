https://www.codewars.com/kata/520b9d2ad5c005041100000f

## Python
```python
def pig_it(text):
    t = text.split(" ")
    for i in range(len(t)):
        t[i] = t[i][1:] + t[i][0]
        if t[i][0].islower() or t[i][0].isupper():
          t[i] = t[i] + 'ay'
    return " ".join(t)
```

## JavaScript
```js
function pigIt(str){
  let t = str.split(" ");
  for (let i=0;i<t.length;i++) {
    if (t[i].toUpperCase() != t[i].toLowerCase()) {
      t[i] = t[i].substring(1)+t[i][0];
      if (t[i][0].toLowerCase() == t[i][0] 
        || t[i][0].toUpperCase() == t[i][0]) {
        t[i] = t[i] + "ay";
      }
    }
  }
  return t.join(" ")
}
```