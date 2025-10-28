https://www.codewars.com/kata/572af273a3af3836660014a1

## JavaScript
```js
function infiniteLoop(arr,d,n){
  let s = []
  for (let a=0;a<arr.length;a++) s.push(arr[a].length);
  arr = arr.reduce((acc, val) => acc.concat(val), []);
  let pos = 0;
  if (d === "left") {
    while (pos<n) {
      arr.push(arr[0]);
      arr.shift();
      pos++;
    }
  }
  if (d === "right") {
    while (pos<n) {
      arr.unshift(arr[arr.length-1]);
      arr.pop();
      pos++;
    }
  }
  pos = 0
  for (let i=0;i<s.length;i++) {
    let v = arr.slice(pos, pos+s[i])
    pos += s[i];
    s[i] = v;
  }
  return s
}
```