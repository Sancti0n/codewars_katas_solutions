https://www.codewars.com/kata/696eacb39271f8aa43b61841

## JavaScript
```js
// 1. Toggle a bit at a given position
const toggleBit = (n, position) => {
  return n ^ (1 << position)
};

// 2. Set a bit at a given position
const setBit = (n, position) => {
  let mask = 1 << position; 
  return n | mask
};

// 3. Clear a bit at a given position
const clearBit = (n, position) => {
  let mask = ~(1 << position);
  return n & mask
};

// 4. Check if a bit at a given position is set
const isBitSet = (n, position) => {
  const mask = 1 << position;
  return (n & mask) !== 0
};

// 5. Set multiple bits using a mask
const setMultipleBits = (n, mask) => {
  return n | mask
};

// 6. Clear multiple bits using a mask
const clearMultipleBits = (n, mask) => {
  return n & ~mask
};

// 7. Toggle multiple bits using a mask
const toggleMultipleBits = (n, mask) => {
  return n ^ mask
};
```

## Python
```py
def toggle_bit(n, p): return n ^ (1 << p)
def set_bit(n, p): return n | (1 << p)
def clear_bit(n, p): return n & ~(1 << p)
def is_bit_set(n, p): return n & (1 << p) != 0
def set_multiple_bits(n, mask): return n | mask
def clear_multiple_bits(n, mask): return n & ~mask
def toggle_multiple_bits(n, mask): return n ^ mask
```

## PHP
```php
// 1. Toggle a bit at a given position
function toggleBit(int $n, int $position): int {
  return $n ^ (1 << $position);
}

// 2. Set a bit at a given position
function setBit(int $n, int $position): int {
  $mask = 1 << $position; 
  return $n | $mask;
}

// 3. Clear a bit at a given position
function clearBit(int $n, int $position): int {
  $mask = ~(1 << $position);
  return $n & $mask;
}

// 4. Check if a bit at a given position is set
function isBitSet(int $n, int $position): bool {
  $mask = 1 << $position;
  return ($n & $mask) !== 0;
}

// 5. Set multiple bits using a mask
function setMultipleBits(int $n, int $mask): int {
  return $n | $mask;
}

// 6. Clear multiple bits using a mask
function clearMultipleBits(int $n, int $mask): int {
  return $n & ~ $mask;
}

// 7. Toggle multiple bits using a mask
function toggleMultipleBits(int $n, int $mask): int {
  return $n ^ $mask;
}
```

## TypeScript
```ts
// 1. Toggle a bit at a given position
export const toggleBit = (n: number, position: number) => { return n ^ (1 << position) };

// 2. Set a bit at a given position
export const setBit = (n: number, position: number) => { let mask = 1 << position; return n | mask };

// 3. Clear a bit at a given position
export const clearBit = (n: number, position: number) => { let mask = ~(1 << position); return n & mask };

// 4. Check if a bit at a given position is set
export const isBitSet = (n: number, position: number) => { const mask = 1 << position; return (n & mask) !== 0 };

// 5. Set multiple bits using a mask
export const setMultipleBits = (n: number, mask: number) => { return n | mask };

// 6. Clear multiple bits using a mask
export const clearMultipleBits = (n: number, mask: number) => { return n & ~mask };

// 7. Toggle multiple bits using a mask
export const toggleMultipleBits = (n: number, mask: number) => { return n ^ mask };
```