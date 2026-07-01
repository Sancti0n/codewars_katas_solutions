https://www.codewars.com/kata/545b342082e55dc9da000051

## Python
```py
def partition(arr, classifier_method):
    t1, t2 = [], []
    for i in arr:
        if classifier_method(i):
            t1.append(i)
        else:
            t2.append(i)
    return (t1, t2)
```