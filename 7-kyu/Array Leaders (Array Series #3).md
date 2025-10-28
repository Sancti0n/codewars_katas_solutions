https://www.codewars.com/kata/5a651865fd56cb55760000e0

## JavaScript
```js
function sum(arr) {
  return arr.reduce((p, c) => p + c, 0)
}

function arrayLeaders(numbers){
  let t = [];
  for (let i=0;i<numbers.length;i++) {
    if (sum(numbers.slice(i+1))<numbers[i]) t.push(numbers[i]);
  }
  return t
}
```

## Python
```python
def array_leaders(numbers):
    t = []
    for i in range(len(numbers)):
        if sum(numbers[i+1:])<numbers[i]: t.append(numbers[i])
    return t
```

## PHP
```php
function arrayLeaders($numbers) {
  $t = [];
  for ($i=0;$i<count($numbers);$i++) {
    if (array_sum(array_slice($numbers, $i+1))<$numbers[$i]) {
      $t[] = $numbers[$i];
    }
  }
  return $t;
}
```