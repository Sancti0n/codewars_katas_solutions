https://www.codewars.com/kata/6502ea6bd504f305f3badbe3

## Python
```py
def twins(age, distance, velocity):
    time_on_earth = distance * 2 / velocity
    age_jill = age + time_on_earth
    age_jack = age + time_on_earth * (1 - velocity**2)**.5
    return (round(age_jack, 1), round(age_jill, 1))
```