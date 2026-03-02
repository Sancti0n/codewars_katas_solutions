https://www.codewars.com/kata/571b6a4a7beb0a8ade0007a8

## JavaScript
```js
function bloodAlcoholContent(drinks, weight, sex, time) {
  let r = sex == "male" ? .73 : .66;
  return Math.round((drinks.ounces*drinks.abv*5.14/weight*r - .015*time)*10000)/10000;
}
```