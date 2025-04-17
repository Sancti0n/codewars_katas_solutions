https://www.codewars.com/kata/551e51155ed5ab41450006e1

## Python
```python
def sum_times_tables(table, a, b):
    s = 0
    for i in table:
        j = a
        while j<=b:
            s += i*j
            j += 1
    return s
```

## JavaScript
```js
function sumTimesTables(tables, min, max){
  return tables.reduce((p, c) => p + c, 0)*(min + max)*(max - min + 1)/2 
}
```