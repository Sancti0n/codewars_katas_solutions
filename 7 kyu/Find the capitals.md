https://www.codewars.com/kata/539ee3b6757843632d00026b

## Python
```python
def capitals(word):
    t = [i for i in range(len(word)) if word[i].isupper()]
    return t
```

## JavaScript
```js
var capitals = function (word) {
	let t = [];
  for (let i=0;i<word.length;i++) {
    if (word[i] == word[i].toUpperCase()) t.push(i);
  }
  return t
};
```

## PHP
```php
function capitals($word) {
  $t = [];
  for ($i=0;$i<strlen($word);$i++) {
    if (ctype_upper($word[$i])) $t[] = $i;
  }
  return $t;
}
```