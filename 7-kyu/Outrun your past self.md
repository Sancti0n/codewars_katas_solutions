https://www.codewars.com/kata/6525caefd77c582baf678ddf

## JavaScript
```js
function number_lappings(my_speed,ghost_speed,time,round_length) {
  if (my_speed <= ghost_speed || time <= 0 || round_length <= 0) {
    return 0;
  }
  const relativeSpeed = my_speed - ghost_speed;
  const distanceAhead = relativeSpeed * time;
  return Math.max(0, Math.ceil(distanceAhead/round_length) - 1);
}
```

## Python
```py
import math

def number_lappings(my_speed,ghost_speed,time,round_length):
    if my_speed <= ghost_speed or time <= 0 or round_length <= 0:
        return 0
    relativeSpeed = my_speed - ghost_speed
    distanceAhead = relativeSpeed * time
    return max(0, math.ceil(distanceAhead/round_length) - 1)
```