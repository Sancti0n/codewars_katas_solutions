https://www.codewars.com/kata/545af3d185166a3dec001190

## Python
```python
def each_cons(lst, n):
    t = []
    for i in range(len(lst)):
        if i+n>len(lst): break
        else :t.append(lst[i:i+n])
    return t
```

## JavaScript
```js
function eachCons(array, n) {
  let t = [];
  for (let i=0;i<array.length-n+1;i++) {
    t.push(array.slice(i,i+n));
  }
	return t
}
```