https://www.codewars.com/kata/5a34af40e1ce0eb1f5000036

## Python
```python
def to_csv_text(array):
    w = ''
    for i in array:
        for j in i:
            w += str(j)+','
        w = w[:-1] + '\n'
    return w[:-1]
```

## JavaScript
```js
function toCsvText(array) {
  let w = '';
  for (let i=0;i<array.length;i++) {
    for (let j=0;j<array[i].length;j++) {
      w += array[i][j].toString()+',';
    }
    w = w.substring(0, w.length-1)+'\n';
  }
  return w.substring(0, w.length-1)
}
```