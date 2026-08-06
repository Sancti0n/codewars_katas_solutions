https://www.codewars.com/kata/567bf4f7ee34510f69000032

## Python
```py
def is_digit(n):
    return n.isdigit() and len(n)<2
```

## JavaScript
```js
String.prototype.digit = function() {
  return this.length == 1 && this >= '0' && this <= '9';
};
```

## TypeScript
```ts
interface String {    // Necessary, keep it here.
  digit(): boolean;
}

String.prototype.digit = function(): boolean {
  return this.length == 1 && this >= '0' && this <= '9';
};
```

## PHP
```php
function parseFloat(string $s) {
  if (preg_match('/^[+-]?(?:\d+(?:\.\d+)?|\.\d+)(?:[eE][+-]?\d+)?/', trim($s), $matches)) {
    return (float) $matches[0];
  }
  return null;
}
```