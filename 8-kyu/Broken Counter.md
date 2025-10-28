https://www.codewars.com/kata/526471539d52735c620000c6

## JavaScript
```js
function Counter() {
  return this.value = 0;
}

Counter.prototype.increase = function() {
  return this.value++;
};

Counter.prototype.getValue = function() {
  return this.value;
};

Counter.prototype.reset = function() {
  return this.value = 0;
};
```