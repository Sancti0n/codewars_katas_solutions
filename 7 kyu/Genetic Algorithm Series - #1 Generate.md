https://www.codewars.com/kata/567d609f1c16d7369c000008

## Python
```python
import random

def generate(length):
    a = ""
    for i in range(length):
        a += str(random.randint(0, 1))
    return(a)
```

## JavaScript
```js
const generate = length => {
  let a = "";
  for (let i=0;i<length;i++) {
    a += Math.round(Math.random());
  }
  return a
};
```

## PHP
```php
function generate($length) {
  $a = "";
  for ($i=0;$i<$length;$i++) {
    $a .= strval(rand(0,1));
  }
  return $a;
}
```