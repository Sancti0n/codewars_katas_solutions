https://www.codewars.com/kata/63adf4596ef0071b42544b9a

## Python
```py
def max_df(a_n: int) -> int:
    target = a_n - 1
    low = 0
    high = 2**101
    ans = 0
    
    while low <= high:
        mid = (low + high) // 2
        if mid * (mid + 1) // 2 <= target:
            ans = mid
            low = mid + 1
        else:
            high = mid - 1
    return ans
```