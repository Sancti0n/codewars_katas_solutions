https://www.codewars.com/kata/52de9bd621c71b919c000592

## Python
```python
def in_sphere(coords, radius):
    s = 0
    for i in coords:
        s += i**2
    return s <= radius**2
```

## JavaScript
```js
function inSphere(coords, radius) {
  let s = 0;
  for (let i=0;i<coords.length;i++) {
    s += coords[i]**2;
  }
  return s <= radius**2
}
```

## Java
```java
public class HyperSphere {
	public static boolean inSphere(Double[] cords, int radius) {
    double s = 0;
    for (int i=0;i<cords.length;i++) {
      s += Math.pow(cords[i], 2);
    }
    return s <= Math.pow(radius, 2);
	}
}
```