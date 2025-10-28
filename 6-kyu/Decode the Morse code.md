https://www.codewars.com/kata/54b724efac3d5402db00065e

## Python
```python
def decode_morse(morse_code):
    s = ""
    for i in morse_code.split(" "):
        if i in MORSE_CODE: s += MORSE_CODE[i]
        else:
            if len(s)>0 and s[-1] != " " and i == "": s += " "
    return s[:-1] if s[-1] == " " else s
```