https://www.codewars.com/kata/573012342713bf4cb4000e79

## JavaScript
```js
hashCode = function(str) {
  var h = 0, l = str.length, i = 0;
  if ( l > 0 ) {
    while (i < l) {
      h = (h << 5) - h + str.charCodeAt(i++) | 0;
    }
  }
  return h
}
```