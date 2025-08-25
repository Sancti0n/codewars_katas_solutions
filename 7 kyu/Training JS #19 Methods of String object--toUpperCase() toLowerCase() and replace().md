https://www.codewars.com/kata/5728203b7fc662a4c4000ef3

## JavaScript
```js
function alienLanguage(str){
  let s = str.toUpperCase().split(" ");
  for (let i=0;i<s.length;i++) {
    s[i] = s[i].substring(0, s[i].length-1) + s[i].substring(s[i].length-1).toLowerCase();
  }
  return s.join(" ")
}
```