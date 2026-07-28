https://www.codewars.com/kata/60e238105b0327001434dfd8

## Python
```py
def maximum_median(arr, min_length):
    k = (min_length-1)//2
    return max(arr[k:len(arr)-k])
```