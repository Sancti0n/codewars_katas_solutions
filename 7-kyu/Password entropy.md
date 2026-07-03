https://www.codewars.com/kata/6a1f03fac18f58f98ad9d21a

## Python
```python
import string
import math

def entropy(password):
    a = string.ascii_lowercase
    b = string.ascii_uppercase
    c = string.digits
    d = string.punctuation
    compteur, somme = 0, 0
    for i in password:
        if compteur == 4:
            break
        if i in a:
            somme += 26
            compteur += 1
            a = ""
        if i in b:
            somme += 26
            compteur += 1
            b = ""
        if i in c:
            somme += 10
            compteur += 1
            c = ""
        if i in d:
            somme += 32
            compteur += 1
            d = ""
    return len(password) * math.log2(somme)
```