https://www.codewars.com/kata/59fb783bab11f89202001083

## JavaScript
```js
function recycleMe(arr){
  let t = [0,0,0];
  for (let i=0;i<arr.length;i++) {
    if (arr[i]>0) t[0]++;
    if (arr[i]<0) t[1]++;
    if (arr[i]==0) t[2]++;
  }
  return t
}
```