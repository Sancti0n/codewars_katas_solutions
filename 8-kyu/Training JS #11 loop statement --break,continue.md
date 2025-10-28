https://www.codewars.com/kata/5721c189cdd71194c1000b9b

## JavaScript
```js
function grabDoll(dolls){
  var bag=[];
  for (let i=0;i<dolls.length;i++) {
    if (bag.length === 3) break //continue
    if (dolls[i] === "Hello Kitty" || dolls[i] === "Barbie doll") bag.push(dolls[i])
  }
  return bag;
}
```