You have a string of numbers; starting with the third number each number is the result of an operation performed using the previous two numbers.

Complete the function which returns a string of the operations in order and separated by a comma and a space, e.g. "subtraction, subtraction, addition"

The available operations are (in this order of preference):

1) addition
2) subtraction
3) multiplication
4) division

Notes:

    All input data is valid
    The number of numbers in the input string >= 3
    For a case like "2 2 4" - when multiple variants are possible - choose the first possible operation from the list (in this case "addition")
    Integer division should be used

Example

"9 4 5 20 25"  -->  "subtraction, multiplication, addition"

Because:

9 - 4 = 5   --> subtraction
4 * 5 = 20  --> multiplication
5 + 20 = 25 --> addition

## Python
```python
from math import *

def say_me_operations(string_numbers):
    t = string_numbers.split(" ")
    op = ["addition, ","subtraction, ","multiplication, ","division, "]
    v = [0]*4
    s = ""
    for i in range(len(t)-2):
        if int(t[i]) + int(t[i+1]) == int(t[i+2]): v[0] = 1
        elif int(t[i]) - int(t[i+1]) == int(t[i+2]): v[1] = 1
        elif int(t[i]) * int(t[i+1]) == int(t[i+2]): v[2] = 1
        elif int(int(t[i]) / int(t[i+1])) == int(t[i+2]) or floor(int(t[i]) / int(t[i+1])) == int(t[i+2]): v[3] = 1
        if sum(v) == 0: s += op[0]
        else: s += op[v.index(1)]
        v = [0]*4
    return s[:-2]
```

## JavaScript
```js
function sayMeOperations(str) {
  let t = str.split(" ").map(Number);
  let op = ["addition, ","subtraction, ","multiplication, ","division, "];
  let v = [0,0,0,0];
  let s = "";
  for (let i=0;i<t.length-2;i++) {
    if (t[i]+t[i+1] == t[i+2]) v[0] = 1;
    else if (t[i]-t[i+1] == t[i+2]) v[1] = 1;
    else if (t[i]*t[i+1] == t[i+2]) v[2] = 1;
    else if (t[i]/t[i+1] == t[i+2] || Math.floor(t[i]/t[i+1]) == t[i+2] || Math.ceil(t[i]/t[i+1]) == t[i+2]) v[3] = 1;
    if (v.indexOf(1)<0) s += op[0];
    else s += op[v.indexOf(1)];
    v = [0,0,0,0];
  }
  return s.substring(0,s.length-2)
}
```