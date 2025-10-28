https://www.codewars.com/kata/57a6633153ba33189e000074

## Python
```python
def ordered_count(inp):
    dict = {}
    for i in inp:
        if i in dict: dict[i] += 1
        else: dict[i] = 1
    return list(dict.items())
```

## JavaScript
```js
const orderedCount = function (text) {
  let dict = {};
  let str = "";
  for (let i=0;i<text.length;i++) {
    if (text[i] in dict) dict[text[i]]++;
    else {
      dict[text[i]] = 1;
      str += text[i];
    }
  }
  let arr = [];
  for (let j=0;j<str.length;j++) {
    if (dict.hasOwnProperty(str[j])) {
        arr.push([str[j], dict[str[j]]]);
    }
  }
  return arr
}
```