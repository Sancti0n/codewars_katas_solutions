https://www.codewars.com/kata/54129112fb7c188740000162

## Python
```python
def prefill(n=0,v=None):
    try:
        return [v]*int(n)
    except:
        raise TypeError(str(n) + ' is invalid')
```

## JavaScript
```js
def prefill(n,v=None):
    try:
        if n == 0: return []
        if type(n) is not float and n != None and type(n) is not bool:
            if type(n) is int or n.isdigit():
                if [v] is list: return prefill(v)
                else: return int(n)*[v]
    except TypeError:
        return n + " is invalid"
```