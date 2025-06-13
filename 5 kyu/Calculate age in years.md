https://www.codewars.com/kata/521660e064dc2ccdd900008d

## JavaScript
```js
function getAge(birthDate, nowDate=new Date()) {
  if (nowDate-birthDate == 1000*3600*24*365 && nowDate.getDate() != birthDate.getDate()) return 0
  return parseInt((nowDate-birthDate)/(1000*3600*24*365))
}
```