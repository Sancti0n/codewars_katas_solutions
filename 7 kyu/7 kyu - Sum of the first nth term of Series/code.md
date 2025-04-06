Your task is to write a function which returns the n-th term of the following series, which is the sum of the first n terms of the sequence (n is the input parameter).
Series: 1 + 1/4 + 1/7+ 1/10 + 1/13 + 1/16 + …

You need to round the answer to 2 decimal places and return it as String.
If the given value is 0 then it should return "0.00".
You will only be given Natural Numbers as arguments.

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