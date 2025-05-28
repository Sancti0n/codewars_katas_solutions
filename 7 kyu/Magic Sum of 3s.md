https://www.codewars.com/kata/57193a349906afdf67000f50

## Python
```python
def magic_sum(arr):
    return sum([i for i in arr if i%2 == 1 and '3' in str(i)])
```

## JavaScript
```js
function magicSum(numbers) {
  let s = 0;
  for (let i=0;i<numbers.length;i++) {
    if (numbers[i]%2 == 1 && numbers[i].toString().indexOf('3')>-1) s += numbers[i];
  }
  return s
}
```