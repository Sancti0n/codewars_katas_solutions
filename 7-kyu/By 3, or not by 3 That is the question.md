https://www.codewars.com/kata/59f7fc109f0e86d705000043

## Python
```python
def divisible_by_three(st): 
    somme, k, a = 0, 0, 0
    for i in st:
        somme += int(i)
    while k<somme:
        k += 3
        a += 1
    if a*3 == somme: return True
    else: return False
```

## PHP
```php
function divisibleByThree($str) {
  $s = 0;
  $k = 0;
  $a = 0;
  for ($i=0;$i<strlen($str);$i++) $s += intval($str[$i]);
  while ($k<$s) {
    $k += 3;
    $a += 1;
  }
  return $a*3 == $s;
}
```

## JavaScript
```js
function divisibleByThree(str){
  let [s, k, a] = [0, 0, 0];
  for (let i=0;i<str.length;i++) s += parseInt(str[i]);
  while (k<s) {
    k += 3;
    a += 1;
  }
  return a*3 == s
}
```