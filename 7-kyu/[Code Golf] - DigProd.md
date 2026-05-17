https://www.codewars.com/kata/6738b83bf489ddf7651e2b5c

## Python
```py
digprod=f=lambda n:n*(n<10)or f(n//10)*(n%10)or 1
```