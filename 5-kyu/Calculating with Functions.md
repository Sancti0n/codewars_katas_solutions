https://www.codewars.com/kata/525f3eda17c7cd9f9e000b39

## Python
```python
def expr(number, op = None):
    if op: return op(number)
    else: return number

def zero(op = None): return expr(0, op)
def one(op = None): return expr(1, op)
def two(op = None): return expr(2, op)
def three(op = None): return expr(3, op)
def four(op = None): return expr(4, op)
def five(op = None): return expr(5, op)
def six(op = None): return expr(6, op)
def seven(op = None): return expr(7, op)
def eight(op = None): return expr(8, op)
def nine(op = None): return expr(9, op)

def times(a): return lambda b: b*a
def plus(a): return lambda b: b+a
def minus(a): return lambda b: b-a
def divided_by(a): return lambda b: int(b/a)
```

## JavaScript
```js
function zero(f) { return f ? f(0) : 0 }
function one(f) { return f ? f(1) : 1 }
function two(f) { return f ? f(2) : 2 }
function three(f) { return f ? f(3) : 3 }
function four(f) { return f ? f(4) : 4 }
function five(f) { return f ? f(5) : 5 }
function six(f) { return f ? f(6) : 6 }
function seven(f) { return f ? f(7) : 7 }
function eight(f) { return f ? f(8) : 8 }
function nine(f) { return f ? f(9) : 9 }

function plus(b) { return function(a) { return a+b } }
function minus(b) { return function(a) { return a-b } }
function times(b) { return function(a) { return a*b } }
function dividedBy(b) { return function(a) { return parseInt(a/b) } };
```