https://www.codewars.com/kata/57fcaed83206fb15fd00027a

## JavaScript
```js
function replaceNth(text, n, oldValue, newValue) {
  if (n<1) return text
  let s = "";
  let c = 0;
  for (let i=0;i<text.length;i++) {
    if (text[i] == oldValue) c++;
    if (text[i] == oldValue && c%n == 0) s += newValue;
    else s += text[i];
  }
  return s
}
```