https://www.codewars.com/kata/569512b7707bc1b88200002f

## JavaScript
```js
const fibonacci = n => {
  if (n==1 || n==2) return 1
  return fibonacci(n-1) + fibonacci(n-2)
};
```