https://www.codewars.com/kata/56a946cd7bd95ccab2000055

## Python
```python
import re

def lowercase_count(strng):
    return len(re.findall("[a-z]", strng))
```

## JavaScript
```js
function lowercaseCount(str){
  return (str.match(/[a-z]/g) || []).length
}
```