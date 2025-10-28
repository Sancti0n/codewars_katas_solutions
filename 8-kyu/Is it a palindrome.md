https://www.codewars.com/kata/57a1fd2ce298a731b20006a4

## Python
```python
def is_palindrome(x):
    return x.lower()[::-1] == x.lower()
```

## JavaScript
```js
function isPalindrome(x) {
  x = x.toLowerCase()
  let a = x.split('').reverse().join('')
  return a === x
}
```

## TypeScript
```ts
export function isPalindrome(x: string): boolean {
  x = x.toLowerCase();
  let a = x.split('').reverse().join('');
  return a === x
}
```