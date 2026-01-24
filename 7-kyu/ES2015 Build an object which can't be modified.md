https://www.codewars.com/kata/599a6aaf1924716c3000003f

## JavaScript
```js
var stone = {
  feature: 'earth',
  style: {
    color: 'black'
  }
};

function deepFreeze(obj) {
  const pNames = Object.getOwnPropertyNames(obj);
  for (const name of pNames) {
    const v = obj[name];
    if (v && typeof v === 'object') {
      deepFreeze(v);
    }
  }
  return Object.freeze(obj);
}

deepFreeze(stone);
```