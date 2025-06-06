https://www.codewars.com/kata/57e8c68c97a05990b10000c3

## JavaScript
```js
function collatz(n) {
  let count = 0;
  while (n>1) {
    n = (n % 2 == 0) ? n / 2 : (n*3) + 1;
    count++;
  }
  return count+1
}
```