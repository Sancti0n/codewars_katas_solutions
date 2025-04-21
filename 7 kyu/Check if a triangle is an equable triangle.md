https://www.codewars.com/kata/57d0089e05c186ccb600035e

## Python
```python
def equable_triangle(a,b,c):
    d = (a+b+c)/2
    s = (d*(d-a)*(d-b)*(d-c))**(1/2)
    return d*2 == s
```

## JavaScript
```js
function equableTriangle(a,b,c) {
  let d = (a+b+c)/2;
  let s = (d*(d-a)*(d-b)*(d-c))**(1/2);
  return d*2 == s
}
```