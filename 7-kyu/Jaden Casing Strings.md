https://www.codewars.com/kata/5390bac347d09b7da40006f6

## Python
```python
def to_jaden_case(string):
    x = string.split(' ')
    print(x)
    i = 0
    while i<len(x):
        if i+1 == len(x):
            x[i] = x[i][0].upper() + x[i][1:]
            i+=1
        else:
            x[i] = x[i][0].upper() + x[i][1:] + ' '
            i+=1
    w = ''
    for i in x:
        w += i
    return w
```

## PHP
```php
function toJadenCase($string) {
   return ucwords($string);
}
```

## JavaScript
```js
String.prototype.toJadenCase = function () {
  let arr = this.split(" ");
  for (let i=0;i<arr.length;i++) arr[i] = arr[i][0].toUpperCase() + arr[i].slice(1);
  return arr.join(" ")
};
```

## TypeScript
```ts
String.prototype.toJadenCase = function () {
  let arr = this.split(" ");
  for (let i=0;i<arr.length;i++) arr[i] = arr[i][0].toUpperCase() + arr[i].slice(1);
  return arr.join(" ")
}

interface String {
  toJadenCase(): string;
}
```