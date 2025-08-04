https://www.codewars.com/kata/581e1d083a4820eb4f00004f

## Python
```python
def mod256_without_mod(number):
    return number - 256*(number//256)
```

## JavaScript
```js
function mod256WithoutMod(number) {
  return number - 256*parseInt(number/256);
}
```