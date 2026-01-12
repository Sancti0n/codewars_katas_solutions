https://www.codewars.com/kata/56bac4c34537cf1e270005a1

## JavaScript
```js
Array.prototype.sort = function () {
  for (let i = 1; i < this.length; i++) {
    let currentValue = this[i];
    let j = i - 1;

    while (j >= 0 && this[j] > currentValue) {
      this[j + 1] = this[j];
      j--;
    }
    this[j + 1] = currentValue;
  }

  return this;
}

let f = [2,1]
f.sort()
console.log(f)
```