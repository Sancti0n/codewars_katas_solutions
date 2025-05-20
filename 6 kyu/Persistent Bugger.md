https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec

## Python
```python
def persistence(n):
    c = 0
    if n<10: return c
    else:
        while n>=10:
            a = 1
            for i in str(n):
                a *= int(i)
            n = a
            c += 1
        return c
```

## PHP
```php
function persistence(int $n): int {
  $c = 0;
  if ($n<10) return $c;
  while ($n>=10) {
    $a = 1;
    for ($i=0;$i<strlen(strval($n));$i++) {
      $a *= strval($n)[$i];
    }
    $n = $a;
    $c++;   
  }
  return $c;
}
```

## JavaScript
```js
function persistence(n) {
  let c = 0;
  if (n<10) return c
  else {
    while (n>=10) {
      let a = 1;
      n = n.toString();
      for (let i=0;i<n.length;i++) {
        a *= parseInt(n[i]);
      }
      n = a;
      c++;
    }
    return c
  } 
}
```

## Java
```java
class Persist {
	public static int persistence(long n) {
    int c = 0;
    if (n<10) return c;
    else {
      while (n>=10) {
        long a = 1;
        String numb = String.valueOf(n);
        for (int i=0;i<numb.length();i++) {
          a *= (long) Character.getNumericValue(numb.charAt(i));
        }
        n = a;
        c++;
      }
      return c;
    }
	}
}
```