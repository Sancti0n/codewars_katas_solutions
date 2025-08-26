https://www.codewars.com/kata/572fdeb4380bb703fc00002c

## JavaScript
```js
function isolateIt(arr) {
  let t = []
  for (let i=0;i<arr.length;i++) {
    t.push(arr[i].substring(0, Math.floor(arr[i].length/2)) + "|" + arr[i].substring(Math.round(arr[i].length/2)))
  }
  return t
}
```