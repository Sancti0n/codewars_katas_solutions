https://www.codewars.com/kata/5983cba828b2f1fd55000114

## Python
```python
def odd_one(arr):
    t = list(filter(lambda x: x%2 != 0, arr))
    return -1 if len(t) == 0 else arr.index(t[0])
```

## JavaScript
```js
function oddOne(arr) {
  let t = arr.filter((x) => x%2 !=0);
  return t.length > 0 ? arr.indexOf(t[0]): -1
}
```