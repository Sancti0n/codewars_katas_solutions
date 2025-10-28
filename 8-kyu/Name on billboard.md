https://www.codewars.com/kata/570e8ec4127ad143660001fd

## Python
```python
def billboard(name, price=30):
    s = 0
    for i in range(len(name)):
        s += price
    return s
```

## JavaScript
```js
function billboard(name, price = 30){
  let s = 0;
  for (let i=0;i<name.length;i++) s += price;
  return s
} 
```