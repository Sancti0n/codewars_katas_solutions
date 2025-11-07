https://www.codewars.com/kata/5a005f4fba2a14897f000086

## Python
```py
def sum_it_up(numbers_with_bases):
    s = 0
    for i in numbers_with_bases:
        s += int(i[0], i[1])
    return s
```

## JavaScript
```js
function sumItUp(numbersWithBases) {
  let s = 0;
  for (let i=0;i<numbersWithBases.length;i++) {
    s += parseInt(numbersWithBases[i][0], numbersWithBases[i][1]);
  }
  return s
}
```