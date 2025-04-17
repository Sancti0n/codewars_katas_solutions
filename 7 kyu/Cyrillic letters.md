https://www.codewars.com/kata/66d85e2db4d3909a8d0b53c9

## Python
```python
import re

def is_cyrillic(letter):
    return bool(re.search('[\u0400-\u04FF]', letter))
```