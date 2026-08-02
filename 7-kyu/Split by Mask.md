https://www.codewars.com/kata/6a68ed7894f29599a1f7a248

## Python
```py
def split_by_mask(strng, mask):
    if len(strng) != sum(mask):
        return None
    c = 0
    t = []
    for i in mask:
        t.append(strng[c:c+i])
        c += i
    return t
```