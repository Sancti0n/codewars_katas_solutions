Make a function called crossProduct that takes two 3 dimensional vectors (in the form of two arrays) and returns their cross product. You need to check if the passed arguments are of the expected format, otherwise throw the message: "Arguments are not 3D vectors!".

```
crossProduct([1,0,0],[0,1,0]) //should return [0,0,1]
crossProduct('gobbledigook', [1,1,1]) //should throw the string "Arguments are not 3D vectors!"
crossprod([1,0,0], [0,1,0], 3, 3)         /* should return [0,0,1] */
crossprod([1,2,3,4,5], [5,4,3,2,1], 5, 5) /* should return NULL */
crossprod([6,6,6], NULL, 3, 3)            /* should return NULL */
crossprod(NULL, NULL, 3, 3)               /* should return NULL */

```

[You can read more about cross product on Wikipedia.](https://en.wikipedia.org/wiki/Cross_product)


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