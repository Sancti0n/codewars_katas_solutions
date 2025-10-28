https://www.codewars.com/kata/585a033e3a36cdc50a00011c

## Python
```python
def freq_seq(s, sep):
    w = ""
    for i in range(len(s)):
        w += str(s.count(s[i]))+sep
    return w[:-1]
```