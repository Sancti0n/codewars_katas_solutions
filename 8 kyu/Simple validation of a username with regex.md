https://www.codewars.com/kata/56a3f08aa9a6cc9b75000023

## Python
```python
import re

def validate_usr(username):
    if len(username)<4 or len(username)>16: return False
    return re.search("^[a-z-0-9_]+$", username) is not None
```