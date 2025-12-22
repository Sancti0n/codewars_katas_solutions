https://www.codewars.com/kata/5a434a9dc5e284724f000011

## Python
```py
def replace_common(st, letter):
    d = {}
    for i in st:
        if i in d and i != " ":
            d[i] += 1
        else:
            d[i] = 1
    if max(d.values()) >= 2:
        for i in d:
            if d[i] == max(d.values()):
                return st.replace(i, letter)
    return st.replace(next(iter(d)), letter)
```

## JavaScript
```js
function replaceCommon(st, letter) {
    let d = {};
    for (let i = 0; i < st.length; i++) {
        if (st[i] in d && st[i] != " ") d[st[i]] += 1;
        else {
            if (st[i] != " ") d[st[i]] = 1;
        }
    }
    if (Math.max(...Object.values(d)) >= 2) {
        for (let j in d) {
            if (d[j] == Math.max(...Object.values(d))) {
                return st.replaceAll(j, letter)
            }
        }
    }
    return st.replaceAll(Object.keys(d)[0], letter)
}
```