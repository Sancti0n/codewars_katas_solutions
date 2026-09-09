https://www.codewars.com/kata/678e32f27625ec1b6a0e5976

## Python
```py
def jumbled_solar_system(solar_system):
    if len(solar_system) < 2:
        return []
    d = ["Asteroid", "Pluto", "Mercury", "Mars", "Venus", "Earth", "Neptune", "Uranus", "Saturn", "Jupiter"]
    t = []
    for i in range(1, len(solar_system)):
        if solar_system[i] == solar_system[i-1]:
            t.append("=")
        elif d.index(solar_system[i]) > d.index(solar_system[i-1]):
            t.append(">")
        else:
            t.append("<")
    return t
```