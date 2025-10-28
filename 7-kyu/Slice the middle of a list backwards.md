https://www.codewars.com/kata/5a043724ffe75fbab000009f

## Python
```python
def reverse_middle(lst):
    if len(lst)%2 == 0: return lst[int(len(lst)/2)-1:int(len(lst)/2)+1][::-1]
    return lst[int(len(lst)/2)-1: int(len(lst)/2)+2][::-1]
```