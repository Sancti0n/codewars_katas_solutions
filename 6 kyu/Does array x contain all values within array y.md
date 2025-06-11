https://www.codewars.com/kata/5143cc9694a24abcd2000001

## JavaScript
```js
Object.defineProperty(Array.prototype, "containsAll", { value: function containsAll(a) {
  for (let i=0;i<a.length;i++) {
    if (this.indexOf(a[i]) == -1) return false
  }
  return true
}});
```