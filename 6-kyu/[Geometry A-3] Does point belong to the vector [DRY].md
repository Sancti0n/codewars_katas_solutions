https://www.codewars.com/kata/554e5ef27daf4082f6000071

## Python
```py
import math

def point_in_vector(point, vector):
    px, py = point
    (x1, y1), (x2, y2) = vector
    
    dist_ab = math.sqrt((x2 - x1)**2 + (y2 - y1)**2)
    
    dist_ap = math.sqrt((px - x1)**2 + (py - y1)**2)
    dist_pb = math.sqrt((px - x2)**2 + (py - y2)**2)

    return abs((dist_ap + dist_pb) - dist_ab) < 1e-6
```