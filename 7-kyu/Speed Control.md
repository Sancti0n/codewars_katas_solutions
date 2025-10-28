https://www.codewars.com/kata/56484848ba95170a8000004d

## TypeScript
```ts
export const gps = (s:number, x:number[]):number => {
  let t = [];
  if (x.length <=1) return 0
  for (let i=0;i<x.length-1;i++) t.push(Math.floor(Math.abs(x[i]-x[i+1])*3600/s));
  return Math.max(...t)
}
```

## Python
```python
def gps(s, x):
    if len(x) < 2: return 0
    a = max(x[i] - x[i-1] for i in range(1, len(x))) 
    return a * 3600.0 / s
```

## JavaScript
```js
function gps(s, x) {
    let t = [];
    if (x.length <=1) return 0
    for (let i=0;i<x.length-1;i++) t.push(Math.floor(Math.abs(x[i]-x[i+1])*3600/s))
    return Math.max(...t)
}
```

## PHP
```php
function gps($s, $x) {
  $t = [];
  if (count($x)<2) return 0;
  for ($i=0;$i<count($x)-1;$i++) {
    $t[] = floor(abs($x[$i]-$x[$i+1])*3600/$s);
  }
  return max($t);
}
```

## Java
```java
public class GpsSpeed {
    
    public static int gps(int s, double[] x) {
      int max = 0;
      for (int i=0;i<x.length-1;i++) {
        if ((int) ((x[i+1]-x[i])*3600/s) > max) {
          max = (int) ((x[i+1]-x[i])*3600/s);
        }
      }
      return max;
    }
}
```