https://www.codewars.com/kata/6a2deeb1a8b6a4b0a80430af

## Python
```py
def do_they_agree(alice, bob):
    temp = set(bob)
    l = [k for k in alice if k in temp]
    c = 0
    for i in alice:
        if i in l:
            if i != l[c]:
                return False
            c += 1
    c = 0
    for j in bob:
        if j in l:
            if j != l[c]:
                return False
            c += 1
    return True
```