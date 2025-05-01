https://www.codewars.com/kata/582c42e0f000e54a7d000086

## JavaScript
```js
function danspower(num, power) {
  return (num**power)%2 == 0 ? num**power: Math.round((num**power)/10)*10
}
```