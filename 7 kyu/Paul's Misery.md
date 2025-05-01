https://www.codewars.com/kata/57ee31c5e77282c24d000024

## JavaScript
```js
function paul(x){
  let s = 0;
  let d = {
    "kata": 5, "Petes kata": 10, "life": 0, "eating": 1
  }
  for (let i=0;i<x.length;i++) {
    s += d[x[i]];
  }
  return s>100 ? "Miserable!": s>=70 ? "Sad!": s>=40 ? "Happy!": "Super happy!"
}
```