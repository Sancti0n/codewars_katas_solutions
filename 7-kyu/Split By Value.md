https://www.codewars.com/kata/5a433c7a8f27f23bb00000dc

## Python
```py
def split_by_value(k, elements):
    t1, t2 = [], []
    for i in elements:
        if i<k:
            t1.append(i)
        else:
            t2.append(i)
    return t1 + t2
```

## JavaScript
```js
function splitByValue(k, elements) {
  let t1 = [], t2 = [];
  for (let i=0;i<elements.length;i++) {
    if (elements[i]<k) {
      t1.push(elements[i]);
    }
    else {
      t2.push(elements[i]);
    }
  }
  return t1.concat(t2);
}
```