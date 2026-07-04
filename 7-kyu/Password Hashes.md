https://www.codewars.com/kata/54207f9677730acd490000d1

## Python
```py
import hashlib

def pass_hash(str):
    return (hashlib.md5(str.encode())).hexdigest()
```