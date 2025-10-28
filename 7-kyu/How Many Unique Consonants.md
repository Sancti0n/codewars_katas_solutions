https://www.codewars.com/kata/5a19226646d843de9000007d

## Python
```python
import string

def count_consonants(text):
    l = ['b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z']
    text = text.lower()
    d = {}
    for i in range(len(text)):
        if text[i] in d: d[text[i]] += 1
        if text[i] not in d and text[i] in l: d[text[i]] = 1
    return len(d)
```