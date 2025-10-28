https://www.codewars.com/kata/56f695399400f5d9ef000af5

## JavaScript
```js
function correctTail(body, tail) {
  let sub = body.substr(body.length-tail.length);
  return sub == tail
}
```

## Python
```python
def correct_tail(body, tail):
    sub = body[len(body)-len(tail):]
    return sub == tail
```

## PHP
```php
function equivalent($body, $char) {
  return substr($body, strlen($body)-strlen($char)) == $char;
}
```