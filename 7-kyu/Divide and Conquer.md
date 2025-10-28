https://www.codewars.com/kata/57eaec5608fed543d6000021

## Python
```python
def div_con(x):
    c = 0
    for i in x:
        if type(i) == str: c -= int(i)
        else: c += i
    return c
```

## JavaScript
```js
function divCon(x){
  let c = 0;
  for (let i=0;i<x.length;i++) {
    if (typeof x[i] == "string") c -= parseInt(x[i]);
    else c += x[i];
  }
  return c
}
```