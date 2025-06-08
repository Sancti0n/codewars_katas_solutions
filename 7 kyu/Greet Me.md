https://www.codewars.com/kata/535474308bb336c9980006f2

## Python
```python
def greet(name): 
    name = name[0].upper()+name[1:].lower()
    return "Hello "+name+"!"
```

## JavaScript
```js
var greet = function(name) {
  return "Hello "+name[0].toUpperCase()+name.toLowerCase().substring(1)+"!"
};
```