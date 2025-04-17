https://www.codewars.com/kata/529f32794a6db5d32a00071f

## JavaScript
```js
var Calculator = {
 average: function(...arr) {
   return arr.length ? arr.reduce((p, c) => p + c, 0)/arr.length: 0
 }
};
```

## Python
```python
class Calculator:
    @staticmethod
    def average(*args):
        return 0 if len(args) == 0 else sum(args)/len(args)
```