https://www.codewars.com/kata/525f039017c7cd0e1a000a26

## Python
```python
def palindrome_chain_length(n):
    if n == int(str(n)[::-1]): return 0
    s = n + int(str(n)[::-1])
    c = 1
    while s != int(str(s)[::-1]):
        s = s + int(str(s)[::-1])
        c += 1
    return c
```