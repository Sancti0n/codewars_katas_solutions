https://www.codewars.com/kata/57126304cdbf63c6770012bd

## Python
```python
def isDigit(string):
    try:
        float(string)
        return True
    except: return False
```

## JavaScript
```js
function isDigit(s) {
  return !isNaN(s) && s != " " && s != ""
}
```