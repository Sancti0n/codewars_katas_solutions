https://www.codewars.com/kata/59c287b16bddd291c700009a

## Python
```py
def ice_brick_volume(radius, bottle_length, rim_length):
    return int((radius * 2**.5)**2 * (bottle_length-rim_length)) 
```

## JavaScript
```js
function iceBrickVolume(radius, bottleLength, rimLength) {
  return parseInt((bottleLength-rimLength) * 2 * radius**2)
}
```

## TypeScript
```ts
export const iceBrickVolume = (radius: number, bottleLength: number, rimLength: number): number => {
  return Math.floor((bottleLength-rimLength) * 2 * radius**2);
}
```

## C
```c
int ice_brick_volume(int radius, int bottle_length, int rim_length) {
  return (bottle_length-rim_length) * 2 * radius * radius;
}
```

## C++
```c++
int ice_brick_volume(int radius, int bottle_length, int rim_length) {
  return (bottle_length-rim_length) * 2 * radius * radius;
}
```

## Ruby
```rb
def ice_brick_volume(radius, bottle_length, rim_length)
    (bottle_length-rim_length) * 2 * radius * radius;
end
```