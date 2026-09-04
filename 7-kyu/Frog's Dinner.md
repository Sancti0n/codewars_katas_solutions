https://www.codewars.com/kata/65f361be2b30ec19b78d758f

## Python
```py
def sumN(n):
    return int(n*(n+1)/2)

def frog_contest(flies):
    chris = sumN(flies)
    tom = sumN(int(chris/2))
    cat = sumN(chris+tom)
    return "Chris ate {} flies, Tom ate {} flies and Cat ate {} flies".format(chris, tom, cat)
```

## JavaScript
```js
function sumN(n) {
  return n*(n+1)/2;
}

function frogContest(n) {
  let chris = sumN(n);
  let tom = sumN(Math.floor(chris/2));
  let cat = sumN(chris+tom);
  return `Chris ate ${chris} flies, Tom ate ${tom} flies and Cat ate ${cat} flies`;
}
```

## PHP
```php
function sumN($n) {
  return $n*($n+1)/2;
}

function frogContest($flies) {
  $chris = sumN($flies);
  $tom = sumN(intval($chris/2));
  $cat = sumN($chris+$tom);
  return "Chris ate ". $chris ." flies, Tom ate ". $tom ." flies and Cat ate ". $cat ." flies";
}
```