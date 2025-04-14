https://www.codewars.com/kata/54566695309908a6590005f1

## JavaScript
```js
function crossProduct (v1, v2) {
  if (Array.isArray(v1) && Array.isArray(v2) && v1.length == 3 && v2.length == 3) {
    let c = v1[1]*v2[2] - v1[2]*v2[1];
    let d = v1[2]*v2[0] - v1[0]*v2[2];
    let e = v1[0]*v2[1] - v1[1]*v2[0];
    return [c,d,e]
  }
  throw ("Arguments are not 3D vectors!");
}
```