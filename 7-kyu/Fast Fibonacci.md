https://www.codewars.com/kata/557226cd3554219bdf00019b

## JavaScript
```js
function fib(num) {
  let a = 0, b = 1, temp = 0, s = 0;
  for (let i=1;i<num;i++) {
    s = a + b;
    temp = b;
    b = a + b;
    a = temp;
  }
  return s
}
```