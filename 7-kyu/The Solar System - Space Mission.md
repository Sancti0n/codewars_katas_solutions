https://www.codewars.com/kata/6aa8e25b5ae7dfbbe29e8fb8

## Python
```py
from preloaded import fuel_map

def successful_mission(solar_system, destination_planet, fuel):
    p = solar_system.index("Earth")
    s = 0
    e = solar_system.index(destination_planet)
    if e < p:
        e, c, p = e-1, -1, p-1
    else:
        e, c, p = e+1, 1, p+1
    for i in range(p, e, c):
        if solar_system[i] == destination_planet:
            s += fuel_map[solar_system[i]] * 2
            break
        else:
            s += fuel_map[solar_system[i]]
    return s <= fuel
```