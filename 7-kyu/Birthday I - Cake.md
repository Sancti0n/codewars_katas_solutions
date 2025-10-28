https://www.codewars.com/kata/5805ed25c2799821cb000005

## Python
```python
import string

def cake(candles,debris):
    if candles == 0: return 'That was close!'
    l = list(string.ascii_lowercase)
    v = 0
    j = 1
    for i in range(len(debris)):
        if j%2 == 0:
            v += l.index(debris[i])+1
            j += 1
        else:
            v += l.index(debris[i])+97
            j += 1
    return 'That was close!' if candles*0.7>v else 'Fire!'
```