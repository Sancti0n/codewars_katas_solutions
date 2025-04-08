zipWith ( or zip_with ) takes a function and two arrays and zips the arrays together, applying the function to every pair of values.
The function value is one new array.

If the arrays are of unequal length, the output will only be as long as the shorter one.
(Values of the longer array are simply not used.)

Inputs should not be modified.

## Examples
```python
zip_with( pow, [10,10,10,10], [0,1,2,3] )     =>  [1,10,100,1000]
zip_with( max, [1,4,7,1,4,7], [4,7,1,4,7,1])  =>  [4,7,7,4,7,7]

def add(a,b): return a+b
zip_with( add,             [0,1,2,3], [0,1,2,3] )  =>  [0,2,4,6]
zip_with( lambda a,b: a+b, [0,1,2,3], [0,1,2,3] )  =>  [0,2,4,6] 
```

## Python
```python
def zip_with(fn,a1,a2):
    return [fn(a1[i], a2[i]) for i in range(min(len(a1), len(a2)))]  
```

## JavaScript
```js
function zipWith(fn,a0,a1) {
  let t = [];
  for (let i=0;i<Math.min(a0.length, a1.length);i++) {
    t.push(fn(a0[i], a1[i]));
  }
  return t
}
```