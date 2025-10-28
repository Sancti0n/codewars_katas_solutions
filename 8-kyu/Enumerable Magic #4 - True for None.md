https://www.codewars.com/kata/545993ee52756d98ca0010e1

## JavaScript
```js
function none(arr, fun){
  return !fun(arr[arr.length-1])
}
```

## Python
```python
def none(lst, func):
    return not any(func(e) for e in lst)
```