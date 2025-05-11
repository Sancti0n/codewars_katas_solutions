https://www.codewars.com/kata/5768a693a3205e1cc100071f

## JavaScript
```js
function initializeNames(name){
  name = name.split(" ");
  let t = [];
  for (let i=0;i<name.length;i++) {
    if (i == 0 || i == name.length-1) t.push(name[i]);
    else t.push(name[i][0]+".");
  }
  return t.join(" ")
}
```

## Python
```python
def initialize_names(name):
    name = name.split(" ")
    t = []
    for i in range(len(name)):
        if (i==0 or i==len(name)-1): t.append(name[i])
        else: t.append(name[i][0]+".")
    return " ".join(t)
```