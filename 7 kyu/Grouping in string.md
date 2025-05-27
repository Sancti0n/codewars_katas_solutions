https://www.codewars.com/kata/5ee8ba31b44cc30032cbce04

## JavaScript
```js
const isConsecutive = (str) => {
  for (let i=0;i<str.length;i++) {
    let c = (str.match(new RegExp(str[i], "g")) || []).length;
    if (str.indexOf(str[i].repeat(c))<0) return false
  }
  return true
}
```