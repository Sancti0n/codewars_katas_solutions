https://www.codewars.com/kata/53d16bd82578b1fb5b00128c

## JavaScript
```js
function grader(score) {
  switch(true) {
      case (score>1 || score<0.6): return "F"
      case (score>=0.9): return "A"
      case (score>=0.8): return "B"
      case (score>=0.7): return "C"
      default: return "D"
  }
}
```

## Python
```python
def grader(score):
    if score>1 or score<0.6: return "F"
    elif score>=0.9: return "A"
    elif score>=0.8: return "B"
    elif score>=0.7: return "C"
    else: return "D"
```