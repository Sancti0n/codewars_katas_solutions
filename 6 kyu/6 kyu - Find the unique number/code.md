Write a function called findUnique which returns the only unique number from an array.

All numbers in the unsorted array are present twice, except the one you have to find. The numbers are always valid integer values between 1 and 2147483647, so no need for type and error checking. The array contains at least one number and may contain millions of numbers. So make sure your solution is optimized for speed.

## Example
```
Input:
[ 1, 8, 4, 4, 6, 1, 8 ]
Expected output:
6
```



## JavaScript
```js
function findUnique(numbers) {
  if (numbers.length == 1) return numbers[0]
  numbers.sort((a,b)=>a-b);
  for (let i=0;i<numbers.length-1;i++) {
    if (i==0 && numbers[i] != numbers[i+1]) return numbers[i]
    if (numbers[i-1] != numbers[i] && numbers[i] != numbers[i+1]) return numbers[i]
  }
  return numbers[numbers.length-1]
}
```