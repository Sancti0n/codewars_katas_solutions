https://www.codewars.com/kata/586560a639c5ab3a260000f3

## JavaScript
```js
function rotate(str) {
  let t = [];
  for (let i=0;i<str.length;i++) {
    t.push(str.slice(i+1)+str.slice(0,i+1));
  }
  return t
}
```

## Python
```py
def rotate(str_):
    return [str_[i+1:]+str_[:i+1] for i in range(len(str_))]
```