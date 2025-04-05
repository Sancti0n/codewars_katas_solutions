The triangular numbers, Tn, may be obtained by this formula:
T(n) = n*(n+1)/2

We select, for example, the first 5 (n terms) consecutive terms of this sequence.

They will be: 1, 3, 6, 10 and 15

Now we want to obtain, again for example, the first 8 (m terms) consecutive multiples to all of these five triangular numbers.

The least common multiple of them will be, 30, so the first eight multiple terms (for the sequence of the above five triangular numbers) will be:

30, 60, 90, 120, 150, 180, 210 and 240

Finally the sum of all these multiples will be: 30 + 60 + 90 + 120 + 150 + 180 + 210 + 240 = 1080

We want a function that may calculate this sum with different values of n and m terms.

Let's see some cases:

## Python
```python
import math

def sum_mult_triangnum(n, m):
    t = [int(i*(i+1)/2) for i in range(1, n+1)]
    return int(math.lcm(*t))*int(m*(m+1)/2)
```