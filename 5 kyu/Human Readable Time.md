https://www.codewars.com/kata/52685f7382004e774f0001f7

## Python
```python
def make_readable(seconds):
    if seconds == 0: return '00:00:00'
    h = seconds//3600
    m = (seconds%3600)//60
    s = (seconds%3600)%60
    if len(str(h))<2: h = '0'+str(h)
    if len(str(m))<2: m = '0'+str(m)
    if len(str(s))<2: s = '0'+str(s)
    return str(h)+':'+str(m)+':'+str(s)
```

## PHP
```php
function human_readable($seconds) {
  if ($seconds == 0) return '00:00:00';
  $h = intval($seconds/3600);
  $m = intval(($seconds%3600)/60);
  $s = ($seconds%3600)%60;
  if (strlen(strval($h))<2) $h = '0'.strval($h);
  if (strlen(strval($m))<2) $m = '0'.strval($m);
  if (strlen(strval($s))<2) $s = '0'.strval($s);
  return strval($h).':'.strval($m).':'.strval($s);
}
```

## JavaScript
```js
function humanReadable (seconds) {
  if (seconds === 0) return '00:00:00'
  let h = parseInt(seconds/3600)
  let m = parseInt((seconds%3600)/60)
  let s = (seconds%3600)%60
  if (h.toString().length<2) h = '0'+h.toString()
  if (m.toString().length<2) m = '0'+m.toString()
  if (s.toString().length<2) s = '0'+s.toString()
  return h.toString()+':'+m.toString()+':'+s.toString()
}
```