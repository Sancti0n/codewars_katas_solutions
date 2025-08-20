https://www.codewars.com/kata/5729b103dd8bac11a900119e

## JavaScript
```js
function fiveLine(s){
  s = s.trim();
  let w = "";
  for (let i=0;i<5;i++) {
    if (i+1 === 5) w += s.repeat(i+1);
    else w += s.repeat(i+1)+"\n";
  }
  return w
}
```