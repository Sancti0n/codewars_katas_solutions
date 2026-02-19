https://www.codewars.com/kata/54cb61619b30e88e44001048

## JavaScript
```js
function runYourString (arg, obj) {
  let Func = new Function(obj.param, obj.func);
  return Func(arg);
}
```