https://www.codewars.com/kata/5f7c38eb54307c002a2b8cc8

## Python
```python
import re
def remove_parentheses(s):
    while re.findall(r"\([^()]*\)", s):
        s = re.sub(r"\([^()]*\)", "", s)
    return s
```