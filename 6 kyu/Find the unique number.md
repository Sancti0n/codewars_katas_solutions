https://www.codewars.com/kata/55f81f9aa51f9b72a200002f

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