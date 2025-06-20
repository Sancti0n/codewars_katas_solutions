https://www.codewars.com/kata/5533c2a50c4fea6832000101

## Python
```python
def create_dict(keys, values):
    dict = {}
    for i in range(len(keys)):
        if i+1>len(values): dict[keys[i]] = None
        else: dict[keys[i]] = values[i]
    return dict
```

## JavaScript
```js
function createDict(keys, values){
  let dict = {};
  for (let i=0;i<keys.length;i++) {
    if (i+1>values.length) dict[keys[i]] = null;
    else dict[keys[i]] = values[i];
  }
  return dict
}
```