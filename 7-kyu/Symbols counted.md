https://www.codewars.com/kata/59ddeeb2fc3c49186f00009c

## JavaScript
```js
const transform = (s) => {
  let st = "", c = 0;
  for (let i=0;i<s.length;i++) {
    if (st.indexOf(s[i])<0) {
      c = (s.match(new RegExp(s[i], "g")) || []).length;
      if (c>1) st += s[i] + c.toString();
      else st += s[i];
    }
  }
  return st
}
```