https://www.codewars.com/kata/5822d89270ca28c85c0000f3

## Python
```python
def scramble(strng, array):
    t = list(range(len(array)))
    for i in range(len(strng)):
        t[array[i]] = strng[i]
    return "".join(t)
```

## JavaScript
```js
function scramble(str, arr) {
  let t = [...Array(arr.length).keys()];
  for (let i=0;i<str.length;i++) {
    t[arr[i]] = str[i];
  }
  return t.join("")
};
```

## PHP
```php
function scramble(string $str, array $indices) : string {
  $t = range(0,count($indices)-1);
  for ($i=0;$i<strlen($str);$i++) {
    $t[$indices[$i]] = $str[$i];
  }
  return implode("", $t);
}
```