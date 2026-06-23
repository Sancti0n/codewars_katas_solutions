https://www.codewars.com/kata/6512c786a07f6a000fe7a274

## JavaScript
```js
function findGlasses(arr){
  const regex = /O-+O/;
  return arr.findIndex(item => regex.test(item));
}
```

## Python
```py
import re

def find_glasses(lst):
    for index, item in enumerate(lst):
        if re.search(r'O-+O', item):
            return index
```