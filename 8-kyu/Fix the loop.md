https://www.codewars.com/kata/55ca43fb05c5f2f97f0000fd

## Python
```py
def list_animals(animals):
    l = ''
    for i in range(len(animals)):
        l += str(i + 1) + '. ' + animals[i] + '\n'
    return l
```