https://www.codewars.com/kata/6a6bdaca77f722e42da8fba6

## JavaScript
```js
function countDirectionChanges(readings) {
  let c = 0;
  let m = readings[0] <= readings[1] ? 1 : -1;
  for (let i=1;i<readings.length-1;i++) {
    if (readings[i] > readings[i+1] && m > 0) {
      c++;
      m = -1;
    }
    if (readings[i] < readings[i+1] && m < 0) {
      c++;
      m = 1;
    }
  }
  return c;
}
```