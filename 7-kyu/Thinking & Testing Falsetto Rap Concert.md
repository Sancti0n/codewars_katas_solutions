https://www.codewars.com/kata/56de38c1c54a9248dd0006e4

## JavaScript
```js
function testit(s) {
  let st = "";
  for (let i = 0; i < s.length; i++) {
    if (s[i].charCodeAt(0) > 64 && s[i].charCodeAt(0) < 91 || s[i].charCodeAt(0) > 96 && s[i].charCodeAt(0) < 123) {
      if (i % 2) {
        if (s[i] == "a") st += "z";
        else if (s[i] == "A") st += "Z";
        else st += String.fromCharCode(s[i].charCodeAt(0) - 1)
      }
      else {
        if (s[i] == "z") st += "a";
        else if (s[i] == "Z") st += "A";
        else st += String.fromCharCode(s[i].charCodeAt(0) + 1);
      }
    }
    else st += s[i];
  }
  return st
}
```