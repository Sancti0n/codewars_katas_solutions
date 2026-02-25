https://www.codewars.com/kata/56d949281b5fdc7666000004

## JavaScript
```js
function testit(a,b){
  a = [... new Set(a)], b = [... new Set(b)];
  return a.concat(b).sort(function(a, b) {return a - b;});
}
```

## Python
```py
def testit(a, b):
    a, b = list(set(a)), list(set(b))
    a = a + b
    a.sort()
    return a
```