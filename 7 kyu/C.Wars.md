https://www.codewars.com/kata/55968ab32cf633c3f8000008

## JavaScript
```js
function initials(n){
  let w = "";
  n = n.split(" ");
  for (let i=0;i<n.length;i++) {
    if (i+1 == n.length) w += n[i][0].toUpperCase() + n[i].slice(1);
    else w += n[i][0].toUpperCase() + ".";
  }
  return w
}
```

## Python
```python
def initials(name):
    w = ""
    name = name.split(" ")
    for i in range(len(name)):
        if i+1 == len(name): w += name[i].title()
        else: w += name[i][0].upper() + "."
    return w
```