https://www.codewars.com/kata/5716955a794d3013d00013f9

## Python
```python
import string

def the_var(the_variables):
    l = list(string.ascii_lowercase)
    d = {}
    for i in range(len(l)): d[l[i]] = i+1 
    s = the_variables.split("+")
    return d[s[0]]+d[s[1]]
```

## JavaScript
```js
function theVar(theVariables) {
  let l = String.fromCharCode(...Array(123).keys()).slice(97).split("")
  let d = {};
  for (let i=0;i<l.length;i++) d[l[i]] = i+1;
  let s = theVariables.split("+");
  return d[s[0]]+d[s[1]]
}
```