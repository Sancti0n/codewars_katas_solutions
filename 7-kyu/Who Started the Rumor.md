https://www.codewars.com/kata/69e8cd7f48dd4ffb1d25ef2f

## Python
```py
def rumor_starter(record):
    t = []
    for i in record:
        t.append(i)
    for j in record:
        for k in record[j]:
            if k in t:
                t.remove(k)
    return sorted(t)
```