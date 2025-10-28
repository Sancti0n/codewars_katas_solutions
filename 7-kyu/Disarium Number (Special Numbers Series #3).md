https://www.codewars.com/kata/5a53a17bfd56cb9c14000003

## Python
```python
def disarium_number(number):
    l = list(map(int,str(number)))
    s = [l[i]**(i+1) for i in range(len(l))]
    if sum(s) == number: return "Disarium !!"
    return "Not !!"
```

## JavaScript
```js
function disariumNumber(n){
  let l = n.toString();
  let s = 0;
  for (let i=0;i<l.length;i++) {
    s += l[i]**(i+1);
  }
  return s == n ? "Disarium !!": "Not !!"
}
```