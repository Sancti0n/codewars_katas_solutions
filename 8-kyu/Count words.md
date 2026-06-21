https://www.codewars.com/kata/570cc83df616a85944001315

## JavaScript
```js
function countWords(str) {
  const words = str.replace(/\s+/g, ' ').trim().split(' ');
  return words[0] === '' ? 0 : words.length;
}
```