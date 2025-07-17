https://www.codewars.com/kata/5259b20d6021e9e14c0010d4

## Python
```python
def reverse_words(text):
    t = text.split(" ")
    for i in range(len(t)):
        t[i] = t[i][::-1]
    return " ".join(t)
```

## JavaScript
```js
function reverseWords(str) {
  str = str.split(" ");
  for (let i=0;i<str.length;i++) str[i] = str[i].split("").reverse().join("");
  return str.join(" ")
}
```

## PHP
```php
function reverseWords($str) {
  $str = explode(" ", $str);
  for ($i=0;$i<count($str);$i++) $str[$i] = strrev($str[$i]);
  return implode(" ", $str);
}
```