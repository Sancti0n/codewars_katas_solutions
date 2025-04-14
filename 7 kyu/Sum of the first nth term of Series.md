https://www.codewars.com/kata/555eded1ad94b00403000071

## JavaScript
```js
function SeriesSum(n) {
    if (n < 2) {
        if (Number.isInteger(n)) return n + ".00"
        else return (parseInt(n * 100) / 100).toString()
    }
    let i = 1, s = 0, a = 1;
    while (a <= n) {
        s += 1 / i;
        i += 3;
        a++;
    }
    return s.toFixed(2)
}
```

## Python
```python
def series_sum(n):
    if n<2: return format(n, '.2f')
    i, s, a = 1, 0, 1
    while a<=n:
        s += 1/i
        i += 3
        a += 1
    return format(s, '.2f')
```

## PHP
```php
function series_sum(int $n): string {
  if ($n<2) return strval($n).".00";
  $i = 1; $s = 0; $a = 1;
  while ($a<=$n) {
    $s += 1/$i;
    $i += 3;
    $a++;
  }
  $s = round($s, 2);
  return strlen(explode(".", round($s, 2))[1])<2 ? $s . "0": $s;
}
```