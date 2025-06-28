https://www.codewars.com/kata/580751a40b5a777a200000a1

## Python
```python
def vowel_one(s):
    t = ['a','e','i','o','u']
    v = ""
    for i in s:
        if i.lower() in t: v += '1'
        else: v += '0'
    return v
```

## JavaScript
```js
function vowelOne(s){
  let t = ['a','e','i','o','u'];
  let v = "";
  for (let i=0;i<s.length;i++) {
    if (t.indexOf(s[i].toLowerCase())>-1) v += '1';
    else v += '0';
  }
  return v
}
```