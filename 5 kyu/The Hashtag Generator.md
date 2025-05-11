https://www.codewars.com/kata/52449b062fb80683ec000024

## Python
```python
def generate_hashtag(s):
    if s == "": return False
    s = s.strip().split(" ")
    for i in range(len(s)):
        if s[i] != "":
            s[i] = s[i][0].upper() + s[i][1:].lower()
    return False if len("#"+"".join(s))>140 else "#"+"".join(s)
```