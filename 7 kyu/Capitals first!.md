https://www.codewars.com/kata/55c353487fe3cc80660001d4

## Python
```py
def capitals_first(text):
    t1, t2 = [[], []]
    for i in text.split(" "):
        if i[0].isupper(): t1.append(i)
        elif i[0].islower(): t2.append(i)
    return " ".join(t1+t2)
```

## JavaScript
```js
function capitalsFirst(st) {
  let t1 = [], t2 = [];
  st = st.split(" ");
  for (let i=0;i<st.length;i++) {
    if (st[i][0].toLowerCase() != st[i][0].toUpperCase()) {
      if (st[i][0] == st[i][0].toUpperCase()) t1.push(st[i]);
      else if (st[i][0] == st[i][0].toLowerCase()) t2.push(st[i]);
    }
  }
  return t1.concat(t2).join(" ")
}
```