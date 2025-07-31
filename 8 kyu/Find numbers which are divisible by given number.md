https://www.codewars.com/kata/55edaba99da3a9c84000003b

## Python
```python
def divisible_by(numbers, divisor):
    return [i for i in numbers if i%divisor == 0]
```

## JavaScript
```js
function divisibleBy(numbers, divisor){
  let t = [];
  for (let i=0;i<numbers.length;i++) {
    if (numbers[i]%divisor == 0) t.push(numbers[i])
  }
  return t
}
```

## PHP
```php
function divisibleBy($numbers, $divisor) {
  $t = [];
  for ($i=0;$i<count($numbers);$i++) {
    if ($numbers[$i]%$divisor == 0) $t[] = $numbers[$i];
  }
  return $t;
}
```