https://www.codewars.com/kata/56abc5e63c91630882000057

## Python
```py
def sameLength(n):
    a = str(n)
    b = "".join(dict.fromkeys(str(n)))
    return len(a) == len(b)

def next_numb(val):
    if val>=9999999999: return "There is no possible number that fulfills those requirements"
    val += 1
    while not (val%2 == 1 and val%3 == 0 and sameLength(val) and val<9999999999):
        val += 1
    return val
```

## JavaScript
```js
function nextNumb(val) {
  if (val>=9999999999) return "There is no possible number that fulfills those requirements"
  val++;
  while (val%2!=1 || val%3!=0 || val.toString().length != [...new Set(val.toString().split(""))].length) {
    val++;
  }
  return val
}
```