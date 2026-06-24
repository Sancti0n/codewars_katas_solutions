https://www.codewars.com/kata/63b06ea0c9e1ce000f1e2407

## Python
```py
def alphabet(ns):
    ns.sort()
    
    A = ns[0]
    B = ns[1]
    
    ns.remove(A)
    ns.remove(B)
    ns.remove(A * B)
    
    C = ns[0]
    
    ns.remove(C)
    ns.remove(B * C)
    
    D = ns[0]
    return D
```

## JavaScript
```js
function alphabet(ns) {
  ns = ns.sort((a,b)=>a-b);
  
  let A = ns[0], B = ns[1];
  ns.shift();
  ns.shift();
  ns.splice(ns.indexOf(A*B), 1);
  
  let C = ns[0];
  
  ns.shift();
  ns.splice(ns.indexOf(B*C), 1);
  
  let D = ns[0];
  return D;
}
```