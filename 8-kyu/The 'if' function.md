https://www.codewars.com/kata/54147087d5c2ebe4f1000805

## JavaScript
```js
function _if(bool, func1, func2) {
  return bool ? func1(): func2()
}
```

## Python
```python
def func1():
    return "True"

def func2():
    return "False"

def _if(bool, func1, func2):
    return func1() if bool else func2()
```