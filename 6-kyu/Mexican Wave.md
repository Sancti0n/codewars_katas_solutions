https://www.codewars.com/kata/58f5c63f1e26ecda7e000029

## Python
```py
def wave(people):
    t, c = [[], 0]
    for i in range(len(people)):
        if people[i] != " ":
            t.append(people[:c]+people[c].upper()+people[c+1:])
            c += 1
        else:
            c += 1
    return t
```

## JavaScript
```js
function wave(str) {
  let t = [], c = 0;
  for (let i=0;i<str.length;i++) {
    if (str[i] != " ") {
      t.push(str.slice(0, c)+str[c].toUpperCase()+str.slice(c+1));
      c++;
    }
    else c++;
  }
  return t
}
```