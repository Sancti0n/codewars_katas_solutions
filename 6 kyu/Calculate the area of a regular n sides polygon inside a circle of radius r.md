https://www.codewars.com/kata/5a58ca28e626c55ae000018a

## Python
```python
import math

def area_of_inscribed_polygon(circle_radius, number_of_sides):
    return .5*number_of_sides*(circle_radius**2)*math.sin(2*math.pi/number_of_sides)
```

## JavaScript
```js
function areaOfPolygonInsideCircle(circleRadius, numberOfSides) {
  return numberOfSides*(circleRadius**2)*Math.sin(2*Math.PI/numberOfSides)/2
}
```

## JavaScript
```js
function areaOfPolygonInsideCircle(circleRadius, numberOfSides) {
    export function areaOfPolygonInsideCircle(circleRadius: number, numberOfSides: number): number {
        return Math.round(1000*numberOfSides*(circleRadius**2)*Math.sin(2*Math.PI/numberOfSides)/2)/1000;
    }
}
```

## PHP
```php
function areaOfPolygonInsideCircle($circleRadius, $numberOfSides): float {
  return round($numberOfSides*($circleRadius**2)*sin(2*pi()/$numberOfSides)/2, 3);
}
```