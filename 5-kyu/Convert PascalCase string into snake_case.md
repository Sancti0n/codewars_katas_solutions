https://www.codewars.com/kata/529b418d533b76924600085d

## Python
```python
def to_underscore(strng: str) -> str:
    st = str(strng)
    s = "" if len(st) < 1 else st[0].lower()
    for i in range(1, len(st)):
        if isinstance(st[i], str):
            if st[i].isupper():
                s += "_"+st[i].lower()
            else: s += st[i]
        else: s += st[i]
    return s
```