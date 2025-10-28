https://www.codewars.com/kata/515e188a311df01cba000003

## Python
```python
def get_planet_name(id):
    switch = {
        1: "Mercury", 
        2: "Venus",
        3: "Earth",
        4: "Mars",
        5: "Jupiter",
        6: "Saturn",
        7: "Uranus", 
        8: "Neptune"
    }
    return switch.get(id)
```

## JavaScript
```js
function getPlanetName(id){
  var name;
  switch(id){
    case 1:
      name = 'Mercury';
      break;
    case 2:
      name = 'Venus';
      break;
    case 3:
      name = 'Earth';
      break;
    case 4:
      name = 'Mars'
      break;
    case 5:
      name = 'Jupiter';
      break;
    case 6:
      name = 'Saturn';
      break;
    case 7:
      name = 'Uranus';
      break;
    case 8:
      name = 'Neptune';
      break;
  }
  return name
}
```

## Java
```java
class Planet {
  static String getPlanetName(int id) {
    String name = null;
    switch (id) {
      case 1: name = "Mercury";
        break;
      case 2: name = "Venus";
        break;
      case 3: name = "Earth";
        break;
      case 4: name = "Mars";
        break;
      case 5: name = "Jupiter";
        break;
      case 6: name = "Saturn";
        break;
      case 7: name = "Uranus";
        break;
      case 8: name = "Neptune";
        break;
    }
    return name;
  }
}
```