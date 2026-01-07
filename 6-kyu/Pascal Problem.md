https://www.codewars.com/kata/53cae2709bbf4cb80c000575

## JavaScript
```js
function pascal(depth) {
  if (depth === 0) return [];
    if (depth === 1) return [[1]];
    let result = [];
    for (let row = 1; row <= depth; row++) {
        let arr = [];
        for (let col = 0; col < row; col++) {
            if (col === 0 || col === row - 1) {
                arr.push(1);
            } else {
                arr.push((result[row-2][col-1] + result[row-2][col]));
            }
        }
        result.push(arr);
    }
    return result;
}
```