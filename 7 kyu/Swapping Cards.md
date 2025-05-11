https://www.codewars.com/kata/65127302a5de2b11c940973d

## Python
```python
def swap_cards(n1, n2):
    vmin = min(int(str(n1)[0]), int(str(n1)[1]))
    if vmin == int(str(n1)[0]):
        return int(str(n2)[0]+str(n1)[1]) > int(str(n1)[0]+str(n2)[1])
    return int(str(n1)[0]+str(n2)[1]) > int(str(n1)[1]+str(n2)[1])
```