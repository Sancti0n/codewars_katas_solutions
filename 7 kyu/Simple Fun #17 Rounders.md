https://www.codewars.com/kata/58846d50f54f021d90000012

## Python
```python
def rounders(value):
    l, i = len(str(value)), 1
    while i<l:
        value = value/(10**i)
        if value%1 >= 0.5:
            value = (int(value)+1)*10**i
        else: value = int(value)*10**i
        i += 1
    return value
```

## JavaScript
```js
function rounders(value) {
  let l = value.toString().length, i = 1;
  while (i<l) {
    value = value/(10**i);
    if (value%1 >= 0.5) {
      value = (parseInt(value)+1)*10**i;
    }
    else {
      value = parseInt(value)*10**i;
    }
    i++;
  }
  return value
}
```