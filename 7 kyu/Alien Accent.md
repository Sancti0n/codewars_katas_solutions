https://www.codewars.com/kata/5874657211d7d6176a00012f

## Python
```python
def convert(st):
    st = st.replace("a", "_")
    st = st.replace("o", "u")
    st = st.replace("_", "o")
    return st
```