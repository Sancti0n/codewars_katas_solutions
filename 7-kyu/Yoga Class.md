https://www.codewars.com/kata/5c79c07b4ba1e100097f4e1a

## Python
```py
def yoga(classroom, poses):
    c = 0
    for i in poses:
        for k in classroom:
            if i == 0:
                c += len(k)
            else:
                s = sum(k)
                for j in k:
                    if s + j >= i:
                        c += 1
    return c
```