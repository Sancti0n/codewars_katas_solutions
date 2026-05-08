https://www.codewars.com/kata/5dd462a573ee6d0014ce715b

## Python
```py
def same_case(a, b):
    return a.isupper() == b.isupper() if a.isalpha() and b.isalpha() else -1
```

## JavaScript
```js
function isUpper(ch){
   return ch.charCodeAt() > 64 && ch.charCodeAt() < 91;
}

function isLower(ch) {
   return ch.charCodeAt() > 96 && ch.charCodeAt() < 123
}

function sameCase(a, b){
  if ((isUpper(a) || isLower(a)) && (isUpper(b) || isLower(b))) {
    if (isUpper(a) === isUpper(b) || isLower(a) === isLower(b)) return 1
    return 0
  }
  else return -1
}
```

## TypeScript
```ts
export function isUpper(ch: string): boolean {
   return ch.charCodeAt(0)>64 && ch.charCodeAt(0)<91;
}

export function isLower(ch: string): boolean {
   return ch.charCodeAt(0)>96 && ch.charCodeAt(0)<123
}

export function sameCase(a : string, b : string): number {
  if ((isUpper(a) || isLower(a)) && (isUpper(b) || isLower(b))) {
    if (isUpper(a) === isUpper(b) || isLower(a) === isLower(b)) return 1
    return 0
  }
  else return -1
}
```