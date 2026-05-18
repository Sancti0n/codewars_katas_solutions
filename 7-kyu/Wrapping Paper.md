https://www.codewars.com/kata/69ea4c6708b1c58c36ac735a

## JavaScript
```js
function wrappingPaper(boxes) {
  let s = 0, a = 0, b = 0, c = 0;
  for (let i=0;i<boxes.length;i++) {
    a = boxes[i][0]*boxes[i][1];
    b = boxes[i][1]*boxes[i][2];
    c = boxes[i][2]*boxes[i][0];
    s += 2*(a + b + c) + Math.min(...[a, b, c]);
  }
  return s;
}
```

## Python
```py
def wrapping_paper(boxes):
    s, a, b, c = 0, 0, 0, 0
    for i in boxes:
        a = i[0]*i[1]
        b = i[1]*i[2]
        c = i[2]*i[0]
        s += 2*(a + b + c) + min(a, b, c)
    return s
```