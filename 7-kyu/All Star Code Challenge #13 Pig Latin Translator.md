https://www.codewars.com/kata/5864e2c473bd9c67b70002ba

## JavaScript
```js
var translate = function(word) {
  if (word.length<2) return word
  let t = "aeiouAEIOU", w = "";
  if (t.indexOf(word[0])<0) w = word.slice(1) + word[0] + "ay";
  else w = word + "ay";
  return w
}
```

## PHP
```php
function translate(string $s): string {
  if (strlen($s)<2) return $s;
  $t = "aeiouAEIOU";
  if (strpos($t, $s[0]) === false) {
    return substr($s, 1) . $s[0] . "ay";
  }
  return $s . "ay";
}
```