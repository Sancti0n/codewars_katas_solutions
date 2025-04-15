https://www.codewars.com/kata/5a02037ac374cbab41000089

## Python
```python
def get_animals_count(legs_number, heads_number, horns_number):
    z = horns_number/2
    y = (legs_number - 2*heads_number)/2 - z
    x = heads_number - y - z
    return {"rabbits" : y, "chickens" : x, "cows" : z}
```