https://www.codewars.com/kata/57a6c52a72292d3235000187

## JavaScript
```js
class BitMath {
  static add(a, b) {
    while (a != 0) {
      let c = b & a;
      b = b ^ a; 
      a = c << 1;
    }
    return b
  }
}
```