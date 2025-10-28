https://www.codewars.com/kata/5a05fe8a06d5b6208e00010b

## Python
```python
def seq_to_one(n):
    if n>1: return list(range(1,n+1))[::-1]
    return list(range(n,2))
```

## JavaScript
```js
function seqToOne(n){
  if (n>0) return Array.from(Array(n)).map((e,i)=>i+1).reverse()
  return [...Array(2-n)].map((v, i) => n+i);
}
```