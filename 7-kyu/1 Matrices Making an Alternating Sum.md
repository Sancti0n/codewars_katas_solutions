https://www.codewars.com/kata/5720eb05e8d6c5b24a0014c5

## Python
```py
def score_matrix(matrix):
    c = 0
    for i in range(len(matrix)):
        for j in range(len(matrix[i])):
            c += matrix[i][j]*(-1)**(i+j)
    return c
```

## JavaScript
```js
function scoreMatrix(matrix) {
  let c = 0;
  for (let i=0;i<matrix.length;i++) {
    for (let j=0;j<matrix[i].length;j++) {
      c += matrix[i][j]*(-1)**(i+j);
    }
  }
  return c
}
```