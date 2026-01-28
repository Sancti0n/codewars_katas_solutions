https://www.codewars.com/kata/5c4cb8fc3cf185147a5bdd02

## Python
```py
def sum_or_product(array, n):
    array.sort()
    t = [0, 1]
    for i in range(n):
        t[0] += array[-i-1]
        t[1] =  array[i]*t[1]
    return "sum" if t[0]>t[1] else "product" if t[0]<t[1] else "same"
```

## JavaScript
```js
function sumOrProduct(array, n) {
  array.sort((a,b)=>a-b);
  let t = [0, 1];
  for (let i=0;i<n;i++) {
    t[0] += array[array.length-i-1];
    t[1] = array[i]*t[1];
  }
  return t[0]>t[1] ? "sum" : t[0]<t[1] ? "product" : "same"
}
```