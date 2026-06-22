https://www.codewars.com/kata/64c7bbad0a2a00198657013d

## Python
```py
def rev_sub(arr):
    j = 0
    while j<len(arr):
        if arr[j]%2 < 1:
            p = j
            while j < len(arr) and arr[j]%2 < 1:
                j += 1
            arr = arr[:p] + arr[p:j][::-1] + arr[j:]
        j += 1
    return arr
```