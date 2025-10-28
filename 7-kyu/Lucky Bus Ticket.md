https://www.codewars.com/kata/58902f676f4873338700011f

## Python
```python
def is_lucky(ticket):
    if len(ticket) != 6 or not ticket.isnumeric(): return False
    return sum(list(map(int, str(ticket[:3])))) == sum(list(map(int, str(ticket[3:]))))
```