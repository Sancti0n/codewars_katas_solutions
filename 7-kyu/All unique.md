https://www.codewars.com/kata/553e8b195b853c6db4000048

## Python
```python
def has_unique_chars(string):
    return len(string) == len(list(set(string)))
```

## JavaScript
```js
function hasUniqueChars(str){
  return str.length == [...new Set(str)].length
}
```

## PHP
```php
function hasUniqueChars($string) {
  $a = str_split($string);
  return strlen($string) == count(array_unique($a));
}
```