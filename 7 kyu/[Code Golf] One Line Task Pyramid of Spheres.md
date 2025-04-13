You are given 4 spheres, one of them lies on 3 others; all the spheres are in contact.
All spheres have the same radius r.

Your task is to write a function that accepts a radius r, and returns the distance between the bottom of the upper sphere and the plane on which they are all located (vertical dashed line at the image below). The answer should be rounded to 4 decimal places. If the function recieves invalid float for radius (r < 0), then it should return 0.0 as an answer.

## Python
```python
calculate_distance=lambda r:(0,round(r*(8/3)**.5,4))[r>0]
```