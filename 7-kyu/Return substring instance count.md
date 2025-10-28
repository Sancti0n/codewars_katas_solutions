https://www.codewars.com/kata/5168b125faced29f66000005

## Python
```python
def solution(full_text, search_text):
    if search_text == "": return len(repr(full_text))-1
    t = full_text.split(search_text)
    return len(t)-1
```