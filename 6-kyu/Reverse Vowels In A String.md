https://www.codewars.com/kata/585db3e8eec141ce9a00008f

## JavaScript
```js
function reverseVowels(str) {
  let a = ["a","e","i","o","u"];
  str = str.split("");
  let t = [];
  let c = 0;
  for (let i=0;i<str.length;i++) {
    if (a.indexOf(str[i].toLowerCase())>-1) {
      t.push(str[i]);
    }
  }
  t = t.reverse();
  for (let j=0;j<str.length;j++) {
    if (a.indexOf(str[j].toLowerCase())>-1) {
      str[j] = t[c];
      c++;
    }
  }
  return str.join("")
}
```