https://www.codewars.com/kata/57ebaa8f7b45ef590c00000c

## JavaScript
```js
function switcher(x){
  let t = String.fromCharCode(...Array(123).keys()).slice(97).split("").reverse();
  let w = "";
  t.push("!");
  t.push("?");
  t.push(" ");
  for (let i=0;i<x.length;i++) w += t[parseInt(x[i])-1];
  return w
}
```

## Python
```python
import string

def switcher(arr):
    t = list(string.ascii_lowercase)[::-1]
    w = ""
    t.append("!")
    t.append("?")
    t.append(" ")
    for i in range(len(arr)): w += t[int(arr[i])-1]
    return w
```

## PHP
```php
function switcher($arr) {
  $t = array_reverse(range('a', 'z'));
  $w = "";
  $t[] = "!";
  $t[] = "?";
  $t[] = " ";
  for ($i=0;$i<count($arr);$i++) $w .= $t[intval($arr[$i])-1];
  return $w;
}
```