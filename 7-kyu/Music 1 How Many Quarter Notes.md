https://www.codewars.com/kata/69c2f04a1294ffc95c526d9e

## JavaScript
```js
function findQuarterNotes(timeSignature) {
  let v = timeSignature.split("/");
  let t = [parseInt(v[0]), parseInt(v[1])];
  if (t[1] == 0 || ((t[1] & (t[1] - 1)) != 0)) {
    return null;
  }
  return Math.floor((t[0]/t[1])/.25)
}
```

## Python
```py
import math

def find_quarter_notes(time_signature):
    v = time_signature.split("/")
    t = [int(v[0]), int(v[1])]
    if t[1] == 0 or ((t[1] & (t[1] - 1) != 0)):
        return None
    return math.floor(t[0]/t[1]/.25)
```

## JavaScript
```js
export function findQuarterNotes(timeSignature: string): number | null {
  let v = timeSignature.split("/");
  let t = [parseInt(v[0]), parseInt(v[1])];
  if (t[1] == 0 || ((t[1] & (t[1] - 1)) != 0)) {
    return null;
  }
  return Math.floor((t[0]/t[1])/.25)
}
```