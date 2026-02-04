https://www.codewars.com/kata/596fba44963025c878000039

## Python
```python
def contamination(text, char):
    return len(text)*char
```

## JavaScript
```js
function contamination(text, char){
  return char.repeat(text.length)
}
```

## PHP
```php
function contamination(string $text, string $char): string {
  return str_repeat($char, strlen($text));
}
```