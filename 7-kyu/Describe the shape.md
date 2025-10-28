https://www.codewars.com/kata/59a1ea8b70e25ef8e3002992

## JavaScript
```js
function describeTheShape(angles){
  if (angles<=2) return "this will be a line segment or a dot"
  return "This shape has "+angles+" sides and each angle measures "+parseInt((angles-2)*180/angles)
}
```

## Python
```python
def describe_the_shape(a):
    if a<=2: return "this will be a line segment or a dot"
    return "This shape has "+str(a)+" sides and each angle measures "+str(int((a-2)*180/a))
```