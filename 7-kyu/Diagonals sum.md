https://www.codewars.com/kata/5592fc599a7f40adac0000a8

## Python
```python
def sum_diagonals(matrix):
    if len(matrix[0]) == 0: return 0
    s = 0
    for i in range(len(matrix)):
        s += matrix[i][i] + matrix[i][len(matrix)-1-i]
    return s
```

## JavaScript
```js
function sum(matrix) {
  if (matrix[0] == []) return 0
  let s = 0;
  for (let i=0;i<matrix.length;i++) {
    s += matrix[i][i]+matrix[i][matrix.length-1-i];
  }
  return s
}
```