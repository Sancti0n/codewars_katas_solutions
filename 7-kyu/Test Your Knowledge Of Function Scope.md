https://www.codewars.com/kata/56d344c7fd3a52566700124b

## JavaScript
```js
function add(y) {
  function addTwo(x) {
    return x + y
  }
  return addTwo
}
```

## Python
```py
def add(y):
    def addTwo(x):
        return x + y
    return addTwo
```

## TypeScript
```ts
export function add(y: number): (x: number) => number {
  return function addTwo(x: number): number {
    return x + y;
  }
}
```