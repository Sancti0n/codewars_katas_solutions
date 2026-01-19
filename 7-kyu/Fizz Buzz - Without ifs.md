https://www.codewars.com/kata/584c702256c98fc0a0000043

## JavaScript
```js
const fizzBuzz = n => {
  return !(n%3 || n%5) ? "FizzBuzz": !(n%5) ? "Buzz": !(n%3) ? "Fizz" : n
};
```