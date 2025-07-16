https://www.codewars.com/kata/52b305bec65ea40fe90007a7

## Python
```python
def grabscrab(word, possible_words):
    t = []
    word = "".join(sorted(word))
    for i in possible_words:
        if word == "".join(sorted(i)): t.append(i)
    return t
```