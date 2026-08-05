https://www.codewars.com/kata/687de0b45ab74765f516ce3f

## JavaScript
```js
function whowon(s) {
  s = s.split(" ");
  let c = 0;
  let a = s[0], b = "";
  for (let i=1;i<s.length;i++) {
    if (s[i] == "reversal") {
      c++;
    }
    if (!b && s[i-1] == "to") {
      b = s[i];
    }
  }
  return c%2 ? a : b;
}
```