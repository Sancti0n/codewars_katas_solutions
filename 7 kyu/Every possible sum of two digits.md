https://www.codewars.com/kata/5b4e474305f04bea11000148

## JavaScript
```js
function digits(num){
  let t = [];
  num = Array.from(String(num), Number);
  for (let i=0;i<num.length;i++) {
    for (let j=i+1;j<num.length;j++) {
      t.push(num[i]+num[j]);
    }
  }
  return t
}
```

## Python
```python
def digits(num):
    t = []
    v = list(map(int, str(num)))
    for i in range(len(v)):
        for j in range(i+1, len(v)):
            t.append(v[i]+v[j])
    return t
```