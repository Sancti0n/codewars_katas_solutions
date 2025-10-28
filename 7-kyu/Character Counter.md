https://www.codewars.com/kata/56786a687e9a88d1cf00005d

## Python
```python
def validate_word(word):
    w = word.lower()
    s = w.count(w[0])
    for i in range(1,len(w)):
        if w.count(w[i]) != s or s%2 == 0 and len(w)%2 == 1: return False
    return True
```