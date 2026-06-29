https://www.codewars.com/kata/534d0a229345375d520006a0

## TypeScript
```ts
export function isPowerOfTwo(n: number): boolean {
  return n.toString(2).split('1').length - 1 == 1
}
```

## Python
```py
def power_of_two(num):
    return bin(num).count('1') == 1
```

## JavaScript
```js
function isPowerOfTwo(n){
  return n.toString(2).split('1').length - 1 == 1
}
```