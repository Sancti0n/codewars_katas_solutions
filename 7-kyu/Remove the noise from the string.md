https://www.codewars.com/kata/5681cf0be812b41721000034

## JavaScript
```js
function removeNoise(str) {
  return str.replace(/[%$&/#·@|º\\ª]/g, "");
}
```

## Python
```py
import re

def remove_noise(st):
    return re.sub(r'[%$&/#·@|º\\ª]', '', st)
```