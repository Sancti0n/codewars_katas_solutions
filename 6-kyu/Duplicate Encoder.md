https://www.codewars.com/kata/54b42f9314d9229fd6000d9c

## Python
```py
def duplicate_encode(word):
    w = ''
    word = list(word.lower())
    for i in word:
        if word.count(i)>1: w += ')'
        else: w += '('
    return w
```

## JavaScript
```js
function duplicateEncode(word){
  let w = '';
  word = word.toLowerCase().split('');
  for (let i=0;i<word.length;i++) {
    if (word.filter(elt => elt === word[i]).length >1) w += ')';
    else w += '(';
  }
  return w
}
```

## PHP
```php
function duplicate_encode($word){
	$w = '';
  $word = str_split(strtolower($word));
  for ($i=0;$i<count($word);$i++) {
    if (count(array_keys($word, $word[$i])) >1) $w .= ')';
    else $w .= '(';
  }
  return $w;
}
```