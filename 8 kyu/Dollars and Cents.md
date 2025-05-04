https://www.codewars.com/kata/55902c5eaa8069a5b4000083

## Python
```python
def format_money(amount):
    if "." not in str(amount): return "$"+str(amount)+".00"
    return "$"+str(amount) if len(str(amount).split(".")[1]) == 2 else "$"+str(amount)+"0"
```