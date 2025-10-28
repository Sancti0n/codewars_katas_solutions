https://www.codewars.com/kata/57f75cc397d62fc93d000059

## Python
```python
def calc(s):
    w = ""
    for i in s:
        w += str(ord(i))
    v = sum(list(map(int, str(w))))
    return v - sum(list(map(int, str((w.replace("7", "1"))))))
```