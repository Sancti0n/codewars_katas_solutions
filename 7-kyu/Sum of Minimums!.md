https://www.codewars.com/kata/5d5ee4c35162d9001af7d699

## Python
```python
def sum_of_minimums(numbers):
    somme = 0
    for i in numbers:
        somme += min(i)
    return somme
```

## PHP
```php
function sum_of_minimums($numbers) {
  $s = 0;
  for ($i=0;$i<count($numbers);$i++) $s += min($numbers[$i]);
  return $s;
}
```

## JavaScript
```js
function sumOfMinimums(arr) {
  let s = 0;
  for (let i=0;i<arr.length;i++) s += Math.min(...arr[i]);
  return s
}
```