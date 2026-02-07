https://www.codewars.com/kata/5a5f3034cadebf76db000023

## Python
```py
def show_bits(n):
    b = f"{n & 0xffff_ffff:032b}"
    return [int(b[i]) for i in range(len(b))]
```