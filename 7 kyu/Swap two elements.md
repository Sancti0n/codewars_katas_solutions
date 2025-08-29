https://www.codewars.com/kata/5a3f4eace1ce0eeda600003d

## JavaScript
```js
function count(arr, v) {
  return arr.filter(elt => elt === v).length
}

function swapTwo(array, a, b) {
  let m = 0;
  if (count(array, b) == 1) {
    m = array.indexOf(a);
    array[array.indexOf(b)] = a;
    array[m] = b;
  }
  else {
    for (let i=array.length;i>0;i--) {
      if (array[i] == b) {
        m = i;
        break;
      }
    }
    array[array.indexOf(a)] = b;
    array[m] = a;
  }
  return array
}
```