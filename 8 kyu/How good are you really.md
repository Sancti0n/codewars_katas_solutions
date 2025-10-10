https://www.codewars.com/kata/5601409514fc93442500010b

## TypeScript
```ts
export function betterThanAverage(classPoints: number[], yourPoints: number) : boolean {
  return classPoints.reduce((a, b) => a + b, 0)/classPoints.length < yourPoints
}
```

## Java
```java
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int sum = 0;
    for (int value : classPoints) sum += value;
    return sum/classPoints.length < yourPoints;
  }
}
```

## Python
```py
def better_than_average(class_points, your_points):
    return sum(class_points)/len(class_points) < your_points
```

## JavaScript
```js
function betterThanAverage(classPoints, yourPoints) {
  return classPoints.reduce((a, b) => a + b, 0)/classPoints.length < yourPoints
}
```

## PHP
```php
function betterThanAverage($classPoints, $yourPoints) {
  return array_sum($classPoints)/count($classPoints) < $yourPoints;
}
```