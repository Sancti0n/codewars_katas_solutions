https://www.codewars.com/kata/57fa92b25c9910e7bc0001df

## JavaScript
```js
function facRecursion(value) {
    if (value<0) return 0
    if (value == 0 || value == 1) return 1
    return value*facRecursion(value-1)
}
```