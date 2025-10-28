https://www.codewars.com/kata/604287495a72ae00131685c7

## JavaScript
```js
function doubleton(num){
  num++;
  let b = new Set(num.toString());
  while (b.size != 2) {
    num++;
    b = new Set(num.toString());
  }
  return num
}  
```

## Python
```python
def doubleton(num):
    num += 1
    b = list(set(str(num)))
    while len(b) != 2:
        num += 1
        b = list(set(str(num)))
    return num
```