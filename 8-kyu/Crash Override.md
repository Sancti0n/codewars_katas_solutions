https://www.codewars.com/kata/578c1e2edaa01a9a02000b7f

## JavaScript
```js
function aliasGen(first, last) {
  if (/^[a-zA-Z]+$/.test(first[0]) && /^[a-zA-Z]+$/.test(last[0])) {
    return firstName[first[0].toUpperCase()] + " " + surname[last[0].toUpperCase()]
  }
  return 'Your name must start with a letter from A - Z.'
}
```

## Python
```python
import re

def alias_gen(f_name, l_name):
    if re.match(r'\A[a-zA-Z]+', f_name[0]) and re.match(r'\A[a-zA-Z]+', l_name[0]):
        return FIRST_NAME[f_name[0].upper()] + " " + SURNAME[l_name[0].upper()]
    return 'Your name must start with a letter from A - Z.'
```