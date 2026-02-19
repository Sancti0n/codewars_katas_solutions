https://www.codewars.com/kata/56f29b3b75e340627a0009d5

## JavaScript
```js
function recurrence(base, formula, term) {
  let i = 1;
  while (i<term) {
    base = formula(base);
    i++;
  }
  return base
}
```