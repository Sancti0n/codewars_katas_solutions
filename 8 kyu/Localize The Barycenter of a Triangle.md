https://www.codewars.com/kata/5601c5f6ba804403c7000004

## Python
```python
def bar_triang(a, b, c):
    return [round((a[0]+b[0]+c[0])/3, 4), round((a[1]+b[1]+c[1])/3, 4)]
```

## JavaScript
```js
function barTriang(a, b, c){
  return [(Math.round((a[0]+b[0]+c[0])/3*10000))/10000, (Math.round((a[1]+b[1]+c[1])/3*10000))/10000]
}
```

## Java
```java
class Barycenter {
  public static double[] barTriang(double[] a, double[] b, double[] c) {
    double[] arr = {(double) (Math.round((a[0]+b[0]+c[0])/3*10000))/10000, (double) (Math.round((a[1]+b[1]+c[1])/3*10000))/10000};
    return arr;
  }
}
```