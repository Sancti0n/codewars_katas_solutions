https://www.codewars.com/kata/5bb904724c47249b10000131

## JavaScript
```js
function points(games) {
  let s = 0;
  for (let i=0;i<games.length;i++) {
    if (parseInt(games[i].split(':')[0]) > parseInt(games[i].split(':')[1])) s += 3;
    if (parseInt(games[i].split(':')[0]) == parseInt(games[i].split(':')[1])) s += 1;
  }
  return s
}
```

## Python
```python
def points(games):
    s = 0
    for i in games:
        if int(i.split(':')[0]) > int(i.split(':')[1]): s += 3
        if int(i.split(':')[0]) == int(i.split(':')[1]): s += 1
    return s
```

## PHP
```php
function points(array $games): int {
  $s = 0;
  for ($i=0;$i<count($games);$i++) {
    if (intval(explode(":", $games[$i])[0]) > intval(explode(":", $games[$i])[1])) $s += 3;
    if (intval(explode(":", $games[$i])[0]) == intval(explode(":", $games[$i])[1])) $s += 1;
  }
  return $s;
}
```