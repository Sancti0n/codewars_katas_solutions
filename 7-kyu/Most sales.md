https://www.codewars.com/kata/5e16ffb7297fe00001114824

## JavaScript
```js
function top3(products, amounts, prices) {
  let temp = [];
  let t = {};
  for (let i=0;i<products.length;i++) {
    t[products[i]] = amounts[i]*prices[i];
    temp.push(amounts[i]*prices[i]);
  }
  let tab = []
  if (temp.filter(e => e === temp[0]).length == temp.length) {
    tab = Object.entries(t)
  }
  else {
    tab = Object.entries(t).sort(([,a],[,b]) => b-a);
  }
  let final = []
  for (let j=0;j<3;j++) {
    final.push(tab[j][0]);
  }
  return final
}
```