https://www.codewars.com/kata/5701bdd564730378ac000b88

## JavaScript
```js
function artefact(name, age, location, status) {
  const obj = {
    "name": name,
    "age": age,
    "location": location,
    "status": status
  }
  const frozenObj = Object.freeze(obj);
  return frozenObj
}
```