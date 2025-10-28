https://www.codewars.com/kata/576d209bed916d2ea30000f7

## JavaScript
```js
function thirstyIn(water, ageOfDwellerArray) {
  if (ageOfDwellerArray.length<1) return -1
  let a = 0, b = 0, c = 0;
  for (let i=0;i<ageOfDwellerArray.length;i++) {
    if (ageOfDwellerArray[i]<18) a++;
    else if (ageOfDwellerArray[i]>50) c++;
    else b++;
  }
  return parseInt(water/(a+b*2+c*1.5))
}
```