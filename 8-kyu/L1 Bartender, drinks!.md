https://www.codewars.com/kata/568dc014440f03b13900001d

## Python
```python
def get_drink_by_profession(param):
    d = {
        "jabroni":"Patron Tequila", 
        "school counselor":"Anything with Alcohol",
        "programmer":"Hipster Craft Beer",
        "bike gang member":"Moonshine",
        "politician":"Your tax dollars",
        "rapper":"Cristal"
    }
    if param.lower() in d: return d[param.lower()]
    return "Beer"
```

## JavaScript
```js
function getDrinkByProfession(param) {
  let d = {
        "jabroni":"Patron Tequila", 
        "school counselor":"Anything with Alcohol",
        "programmer":"Hipster Craft Beer",
        "bike gang member":"Moonshine",
        "politician":"Your tax dollars",
        "rapper":"Cristal"
  };
  return Object.keys(d).indexOf(param.toLowerCase())>-1 ? d[param.toLowerCase()] : "Beer"
}
```