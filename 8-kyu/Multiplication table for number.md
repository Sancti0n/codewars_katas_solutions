https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce

## Python
```python
def multi_table(number):
    w = ''
    for i in range(1,11):
        if i == 10: w += str(i)+' * '+str(number)+' = '+str(number*i)
        else: w += str(i)+' * '+str(number)+' = '+str(number*i)+'\n'
    return w
```

## JavaScript
```js
function multiTable(number) {
  let w = '';
  for (let i=1;i<11;i++) {
    if (i == 10) w += i.toString()+' * '+number.toString()+' = '+(number*i).toString();
    else w += i.toString()+' * '+number.toString()+' = '+(number*i).toString()+'\n';
  }
  return w
}
```