https://www.codewars.com/kata/587f1e1f39d444cee6000ad4

## JavaScript
```js
class Vector{
  constructor(x, y) {
    this.x = x;
    this.y = y;
  }
  
  add(v) {
    let a = this.x + v.x; 
    let b = this.y + v.y;
    return new Vector(a, b)
  }
}
```