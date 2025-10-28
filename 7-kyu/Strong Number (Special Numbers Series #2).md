https://www.codewars.com/kata/5a4d303f880385399b000001

## Python
```python
def facto(n):
    if n == 0: return 1
    return n*facto(n-1)

def strong_num(number):
    s = 0
    for i in str(number):
        s += facto(int(i))
    return "STRONG!!!!" if s == number else "Not Strong !!"
```

## JavaScript
```js
function facto(n) {
  if (n==0) return 1
  return n*facto(n-1)
}

function strong(n) {
  let s = 0, nb = n.toString();
  for (let i=0;i<nb.length;i++) {
    s += facto(parseInt(nb[i]));
  }
  return s == nb ? "STRONG!!!!": "Not Strong !!"
}
```

## Java
```java
class StrongNumber {
  public static Integer facto(int n) {
    if (n==0) return 1;
    return n*facto(n-1);
  }
  
  public static String isStrongNumber(int num) {
    int s = 0;
    String nb = String.valueOf(num);
    for (int i=0;i<nb.length();i++) {
      s += facto(nb.charAt(i)-'0');
    }
    return s == num ? "STRONG!!!!": "Not Strong !!";
  }
}
```

## PHP
```php
function facto($n) {
  if ($n==0) return 1;
  return $n*facto($n-1);
}

function strong($n) {
  $s = 0;
  $nb = strval($n);
  for ($i=0;$i<strlen($nb);$i++) {
    $s += facto(intval($nb[$i]));
  }
  return $s == $nb ? "STRONG!!!!": "Not Strong !!";
}
```