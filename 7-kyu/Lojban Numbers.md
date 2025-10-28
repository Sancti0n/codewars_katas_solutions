https://www.codewars.com/kata/6584b7cac29ca91dd9124009

## Python
```python
def convert_lojban(s):
    d = {"pa": "1", "vo": "4", "ze": "7", "re": "2", "mu": "5", "bi": "8", "no": "0", "ci": "3", "xa": "6", "so": "9"}
    t = []
    while s:
        t.append(d[s[:2]])
        s = s[2:]
    return int("".join(t))
```