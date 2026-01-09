https://www.codewars.com/kata/55f2c3dde50947271200006a

## JavaScript
```js
function addProperty(obj, prop, value) {
  if (obj.hasOwnProperty(prop)) {
    throw new Error("The property already exists!");
  }
  else {
    obj[prop] = value;
  }
  return obj
}
```