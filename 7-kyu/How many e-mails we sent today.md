https://www.codewars.com/kata/58a369fa5b3daf464200006c

## JavaScript
```js
function getPercentage(sent, limit=1000) {
  if (sent == 0) return "No e-mails sent"
  if (sent >= limit) return "Daily limit is reached"
  return Math.floor((sent/limit)*100) + "%"
}
```

## Python
```py
def get_percentage(sent, limit=1000):
    if sent == 0:
        return "No e-mails sent"
    if sent >= limit:
        return "Daily limit is reached"
    return str(int(100*sent/limit)) + "%"
```

## PHP
```php
function getPercentage(int $sent, int $limit = 1000): string {
  if ($sent == 0) {
    return "No e-mails sent";
  }
  if ($sent >= $limit) {
    return "Daily limit is reached";
  }
  return strval(intval(100*$sent/$limit)) . "%";
}
```