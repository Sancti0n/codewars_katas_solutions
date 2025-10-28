https://www.codewars.com/kata/551204b7509063d9ba000b45

## Python
```python
def main_diagonal_product(mat):
    s = 1
    j = 0
    for i in mat:
        s *= i[j]
        j += 1
    return s
```

## JavaScript
```js
function mainDiagonalProduct(mat) {
  let s = 1;
  for (let i=0;i<mat.length;i++) {
    s *= mat[i][i];
  }
  return s
}
```