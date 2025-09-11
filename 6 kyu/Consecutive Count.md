https://www.codewars.com/kata/59c3e819d751df54e9000098/train/python

## Python
```py
def get_consective_items(items, key):
    a, b, c, i = [str(items), str(key), 0, 0]
    t = [0]
    while i<len(a):
        if a[i] == b:
            c += 1
            i += 1
        else:
            if c>0 and c not in t:
                t.append(c)
            c = 0
            i += 1
    if c>0 and c not in t:
        t.append(c)
    return max(t)
```

## JavaScript
```js
function getConsectiveItems(items, key) {
  let a = items.toString(), b = key.toString(), c = 0, i = 0, t = [0];
  while (i<a.length) {
    if (a[i] == b) {
      c++;
      i++;
    }
    else {
      if (c>0 && t.indexOf(c)<0) {
        t.push(c);
      }
      c = 0;
      i++;
    }
  }
  return Math.max(...t, c)
}
```