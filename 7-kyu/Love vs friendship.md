https://www.codewars.com/kata/59706036f6e5d1e22d000016

## Python
```python
import string
def words_to_marks(s):
    t = list(string.ascii_lowercase)
    sm = 0
    for i in range(len(s)):
        sm += t.index(s[i])+1
    return sm
```

## JavaScript
```js
function wordsToMarks(s){
  let t = String.fromCharCode(...Array(123).keys()).slice(97).split("");
  let sm = 0;
  for (let i=0;i<s.length;i++) sm += t.indexOf(s[i])+1;
  return sm
}
```

## PHP
```php
function wordsToMarks(string $str): int {
  $t = range('a', 'z');
  $s = 0;
  for ($i=0;$i<strlen($str);$i++) $s += array_search($str[$i], $t)+1;
  return $s;
}
```