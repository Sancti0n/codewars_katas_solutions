https://www.codewars.com/kata/598f76a44f613e0e0b000026

## Python
```python
def sum_of_integers_in_string(s):
    v = 0
    i = 0
    while i<len(s):
        a = ""
        if s[i].isdigit() and i<len(s):
            while s[i].isdigit():
                a += s[i]
                i += 1
                if i == len(s): return v + int(a)
            v += int(a)
        else: i += 1
    return v
```

## JavaScript
```js
function sumOfIntegersInString(s){
  let v = 0;
  let i = 0;
  while (i<=s.length) {
    let a = "";
    if (!isNaN(s[i]) && !isNaN(parseFloat(s[i]))) {
      while (!isNaN(s[i])) {
        a += s[i];
        i++;
        if (i == s.length) return v + parseInt(a)
      }
      v += parseInt(a);
    }
    else i++;
  }
  return v
}
```