https://www.codewars.com/kata/54bb6ee72c4715684d0008f9

## Python
```python
def solution(number):
    n5 = (number - 1) // 5
    n3 = (number - 1) // 3
    n15 = (number - 1) // 15

    sum_5 = ((n5 * (n5 + 1)) // 2) * 5
    sum_3 = ((n3 * (n3 + 1)) // 2) * 3
    sum_15 = ((n15 * (n15 + 1)) // 2) * 15

    return sum_5 + sum_3 - sum_15
```

## JavaScript
```js
function solution(number) {
  let n5 = parseInt((number - 1) / 5);
  let n3 = parseInt((number - 1) / 3);
  let n15 = parseInt((number - 1) / 15);
  
  let sum_5 = parseInt((n5 * (n5 + 1)) / 2) * 5;
  let sum_3 = parseInt((n3 * (n3 + 1)) / 2) * 3;
  let sum_15 = parseInt((n15 * (n15 + 1)) / 2) * 15;
  
  return sum_5 + sum_3 - sum_15
}
```