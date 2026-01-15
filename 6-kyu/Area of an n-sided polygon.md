https://www.codewars.com/kata/5727500a20c7f837fc001869

## Python
```py
def area_polygon(vertex):
    area = 0
    j = len(vertex) - 1
    for i in range(len(vertex)):
        area += (vertex[j][0]+vertex[i][0]) * (vertex[j][1]-vertex[i][1])
        j = i
    return round(abs(area/2), 1)
```