https://www.codewars.com/kata/525f50e3b73515a6db000b83

## JavaScript
```js
function createPhoneNumber(numbers){
  return numbers.reduce(
    (str, val) => str.replace(/{}/, val),
    '({}{}{}) {}{}{}-{}{}{}{}'
  )
}
```

## Python
```python
def create_phone_number(n):
    return "({}{}{}) {}{}{}-{}{}{}{}".format(*n)
```

## PHP
```php
function createPhoneNumber($n) {
  $n = implode("", $n);
  return "(".substr($n, 0, 3).") ".substr($n, 3, 3)."-".substr($n, 6, 4);
}
```