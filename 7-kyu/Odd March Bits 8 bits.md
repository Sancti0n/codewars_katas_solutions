https://www.codewars.com/kata/58ee4db3e479611e6f000086

## Python
```py
def bit_march (n : int) -> list:
    t = [0 for i in range(8-n)] + [1 for i in range(n)]
    l = []
    l.append(t.copy())
    while t[0] != 1:
        t.pop(0)
        t.append(0)
        l.append(t.copy())
    return l
```

## JavaScript
```js
function bitMarch (n) {
    let a = new Array(8-n).fill(0);
    let b = new Array(n).fill(1);
    let t = a.concat(b);
    let l = [];
    l.push([...t]);
    while (n<8) {
        t.shift(0);
        t.push(0);
        l.push([...t]);
        n++;
    }
    return l
}
```