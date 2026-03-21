https://www.codewars.com/kata/55fd4919ce2a1d7c0d0000f3

## JavaScript
```js
function hasTwoCubeSums(n) {
  let count = 0, x = 1, y = Math.ceil(n**(1/3));
  while (x < y) {
    const sum = x**3 + y**3;
    if (sum === n) {
      count++;
      x++;
      y--;
    } else if (sum<n) {
      x++;
    } else {
      y--;
    }
    if (count === 2) return true
  }
  return false
}
```

## Python
```py
def has_two_cube_sums(n):
    count, x, y = 0, 1, int(n**(1/3)) + 1
    while x<y:
        sum_cubes = x**3 + y**3
        if sum_cubes == n:
            count += 1
            x += 1
            y -= 1
            if count == 2:
                return True
        elif sum_cubes<n:
            x += 1
        else:
            y -= 1
    return False
```

## Java
```java
public class Kata {
  
  public static boolean hasTwoCubeSums(int n) {
    int count = 0;
    long target = (long) n;
    long x = 1;
    long y = (long) Math.round(Math.pow(target, 1.0/3.0)) + 1;

    while (x<y) {
        long sum = x*x*x + y*y*y;
        if (sum == target) {
            count++;
            x++;
            y--;
        } else if (sum < target) {
            x++;
        } else {
            y--;
        }
    }
    return count == 2;
  }
}
```