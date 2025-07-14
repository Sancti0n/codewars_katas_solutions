https://www.codewars.com/kata/58bf9bd943fadb2a980000a7

## Python
```python
def who_is_paying(name):
    if len(name)<=2: return [name]
    return [name, name[:2]]
```

## JavaScript
```js
function whoIsPaying(name){
  if (name.length<=2) return [name]
  return [name, name.substring(0, 2)]
}
```