https://www.codewars.com/kata/652d5d55da13f3001fc1c37a

## JavaScript
```js
function wasCalledWithNew() {
  const avecNew = (typeof new.target !== 'undefined');
  return {
    valueOf: function() {
      return avecNew;
    }
  };
}
```